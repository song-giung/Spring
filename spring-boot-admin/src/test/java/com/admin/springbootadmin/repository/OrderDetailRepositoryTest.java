package com.admin.springbootadmin.repository;

import com.admin.springbootadmin.SpringBootAdminApplicationTests;
import com.admin.springbootadmin.model.entity.OrderDetail;
import com.admin.springbootadmin.model.enumClass.OrderStatus;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class OrderDetailRepositoryTest extends SpringBootAdminApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void create() {
        OrderDetail orderDetail = new OrderDetail();

        orderDetail.setStatus(OrderStatus.ORDERING);
        orderDetail.setArrivalDate(LocalDateTime.now().plusDays(2));
        orderDetail.setQuantity(1);
        orderDetail.setTotalPrice(BigDecimal.valueOf(90000));
        //orderDetail.setOrderGroupId(1L); -> OrderGroup
        //orderDetail.setItemId(1L); -> Item
        orderDetail.setCreatedAt(LocalDateTime.now());
        orderDetail.setCreatedBy("adminServer");

        OrderDetail newOrderdetail = orderDetailRepository.save(orderDetail);

        Assert.assertNotNull(newOrderdetail);
    }

}