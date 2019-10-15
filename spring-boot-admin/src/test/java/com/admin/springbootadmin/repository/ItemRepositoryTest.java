package com.admin.springbootadmin.repository;

import com.admin.springbootadmin.SpringBootAdminApplicationTests;
import com.admin.springbootadmin.model.entity.Item;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class ItemRepositoryTest extends SpringBootAdminApplicationTests {
    @Autowired
    private ItemRepository itemRepository;


    @Test
    public void create() {


        Item item = new Item();
        item.setStatus("UNREGISTERED");
        item.setName("삼성 노트북");
        item.setTitle("Samsung artBook");
        item.setContent("2019년형 노트북 입니다.");
        item.setPrice(BigDecimal.valueOf(999000));
        item.setBrandName("삼성");
        item.setCreatedAt(LocalDateTime.now());
        item.setCreatedBy("adminServer");
        item.setRegisteredAt(LocalDateTime.now());
        //item.setPartnerId(1L);
        Item newItem = itemRepository.save(item);

        Assert.assertNotNull(newItem);

    }
}