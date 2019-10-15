package com.admin.springbootadmin.service;

import com.admin.springbootadmin.ifs.CRUDInterface;
import com.admin.springbootadmin.model.entity.Item;
import com.admin.springbootadmin.model.network.Header;
import com.admin.springbootadmin.model.network.request.ItemApiRequest;
import com.admin.springbootadmin.model.network.response.ItemApiResponse;
import com.admin.springbootadmin.repository.ItemRepository;
import com.admin.springbootadmin.repository.PartnerRepository;
import net.bytebuddy.description.NamedElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ItemApiService implements CRUDInterface<ItemApiRequest, ItemApiResponse> {

    @Autowired
    private PartnerRepository partnerRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Header<ItemApiResponse> create(Header<ItemApiRequest> request) {

        ItemApiRequest body = request.getData();

        Item item = Item.builder()
                .status(body.getStatus())
                .name(body.getName())
                .title(body.getTitle())
                .content(body.getContent())
                .price(body.getPrice())
                .brandName(body.getBrandName())
                .registeredAt(LocalDateTime.now())
                .partner(partnerRepository.getOne(body.getPartnerId()))
                .build();

        Item newItem = itemRepository.save(item);

        return response(newItem);
    }

    @Override
    public Header<ItemApiResponse> read(Long id) {

        Optional<Item> optionalItem = itemRepository.findById(id);

        return optionalItem.map(item -> response(item)).orElseGet(() ->Header.ERROR("데이터 없음"));
    }

    @Override
    public Header<ItemApiResponse> update(Header<ItemApiRequest> request) {
        ItemApiRequest itemApiRequest = request.getData();

        Optional<Item> optionalItem = itemRepository.findById(itemApiRequest.getId());




        return optionalItem.map(
                item -> {item.setName(itemApiRequest.getName())
                        .setStatus(itemApiRequest.getStatus())
                        .setTitle(itemApiRequest.getTitle())
                        .setContent(itemApiRequest.getContent())
                        .setPrice(itemApiRequest.getPrice())
                        .setBrandName(itemApiRequest.getBrandName())
                        .setPartner(partnerRepository.findById(itemApiRequest.getPartnerId()).get())
                        .setRegisteredAt(itemApiRequest.getRegisteredAt())
                        .setUnregisteredAt(itemApiRequest.getUnregisteredAt());
                    return item;
                }
            )
                .map(Item -> itemRepository.save(Item))
                .map(updatedItem -> response(updatedItem))
                .orElseGet(() -> Header.ERROR("데이터 없음"));
    }

    @Override
    public Header delete(Long id) {
        return itemRepository.findById(id)
                .map(item -> {
                    itemRepository.delete(item);
                    return Header.OK();})
                .orElseGet(() -> Header.ERROR("데이터 없음"));
    }


    public Header<ItemApiResponse> response(Item item) {

        ItemApiResponse body = ItemApiResponse.builder()
                .id(item.getId())
                .status(item.getStatus())
                .name(item.getName())
                .title(item.getTitle())
                .content(item.getContent())
                .price(item.getPrice())
                .brandName(item.getBrandName())
                .registeredAt(item.getRegisteredAt())
                .unregisteredAt(item.getUnregisteredAt())
                .partnerId(item.getPartner().getId())
                .build();

        return Header.OK(body);
    }
}
