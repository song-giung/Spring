package com.admin.springbootadmin.repository;

import com.admin.springbootadmin.SpringBootAdminApplicationTests;
import com.admin.springbootadmin.model.entity.OrderGroup;
import com.admin.springbootadmin.model.entity.User;
import com.admin.springbootadmin.model.enumClass.OrderStatus;
import com.admin.springbootadmin.model.enumClass.OrderType;
import com.admin.springbootadmin.model.enumClass.PaymentType;
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


        orderGroup.setStatus(OrderStatus.COMPLETE);
        orderGroup.setOrderType(OrderType.ALL);
        orderGroup.setRevAddress("서울시 강남구");
        orderGroup.setRevName("홍길동");
        orderGroup.setPaymentType(PaymentType.CARD);
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