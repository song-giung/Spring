package com.admin.springbootadmin.controller.api;

import com.admin.springbootadmin.ifs.CRUDInterface;
import com.admin.springbootadmin.model.network.Header;
import com.admin.springbootadmin.model.network.request.ItemApiRequest;
import com.admin.springbootadmin.model.network.response.ItemApiResponse;
import com.admin.springbootadmin.service.ItemApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/item")
public class ItemApiController implements CRUDInterface<ItemApiRequest, ItemApiResponse> {

    @Autowired
    private ItemApiService itemApiService;

    @Override
    @PostMapping("")
    public Header<ItemApiResponse> create(@RequestBody Header<ItemApiRequest> request) {
        log.info("itemController create : {}", request);
        return itemApiService.create(request);
    }

    @Override
    @GetMapping("{id}")
    public Header<ItemApiResponse> read(@PathVariable Long id) {
        log.info("itemController read : {}", id);
        return itemApiService.read(id);
    }

    @Override
    @PutMapping("")
    public Header<ItemApiResponse> update(@RequestBody Header<ItemApiRequest> request) {
        log.info("itemController update : {}", request);
        return itemApiService.update(request);
    }

    @Override
    @DeleteMapping("{id}")
    public Header delete(@PathVariable Long id) {
        log.info("itemController delete : {}", id);
        return itemApiService.delete(id);
    }
}
