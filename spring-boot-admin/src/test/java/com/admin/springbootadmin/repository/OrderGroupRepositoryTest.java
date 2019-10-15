package com.admin.springbootadmin.repository;

import com.admin.springbootadmin.SpringBootAdminApplicationTests;
import com.admin.springbootadmin.model.entity.OrderGroup;
import com.admin.springbootadmin.model.entity.User;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.Assert.*;

public class OrderGroupRepositoryTest extends SpringBootAdminApplicationTests {

    @Autowired
    private OrderGroupRepository orderGroupRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() {
        OrderGroup orderGroup = new OrderGroup();

        User user =  userRepository.findAll().get(0);


        orderGroup.setStatus("complete");
        orderGroup.setOrderType("ALL");
        orderGroup.setRevAddress("서울시 강남구");
        orderGroup.setRevName("홍길동");
        orderGroup.setPaymentType("카드");
        orderGroup.setTotalPrice(BigDecimal.valueOf(900000));
        orderGroup.setTotalQuantity(1);
        orderGroup.setOrderAt(LocalDateTime.now().minusDays(2));
        orderGroup.setArrivalDate(LocalDateTime.now());
        orderGroup.setCreatedAt(LocalDateTime.now());
        orderGroup.setCreatedBy("adminServer");
        orderGroup.setUser(user);
        //orderGroup.setUserId(1l); -> User

        OrderGroup newOrderGroup = orderGroupRepository.save(orderGroup);



        Assert.assertNotNull(newOrderGroup);
    }

}