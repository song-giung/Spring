package com.admin.springbootadmin.repository;

import com.admin.springbootadmin.SpringBootAdminApplicationTests;
import com.admin.springbootadmin.model.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.Assert.*;

public class UserRepositoryTest extends SpringBootAdminApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
        String account = "Test01";
        String password = "Test01";
        String status = "REGISTERED";
        String email = "Test01@gmail.com";
        String phoneNumber = "010-1234-1234";
        LocalDateTime registeredAt = LocalDateTime.now();
        LocalDateTime createdAt = LocalDateTime.now();
        String createdBy = "adminServer";

        User user = new User();

        user.setAccount(account);
        user.setPassword(password);
        user.setStatus(status);
        user.setEmail(email);
        user.setPhoneNumber(phoneNumber);
        user.setRegisteredAt(registeredAt);
        user.setCreatedBy(createdBy);
        user.setCreatedAt(createdAt);

        User newUser = userRepository.save(user);

        Assert.assertNotNull(newUser);
    }

    @Test
    @Transactional
    public void read() {
        Optional<User> user = userRepository.findFirstByPhoneNumberOrderByIdDesc("010-1234-1234");


        Assert.assertNotNull(user.get());

        if( user.isPresent()) {
            user.get().getOrderGroupList().stream().forEach(orderGroup -> {
                System.out.println("주문 묶음");
                System.out.println(orderGroup.getTotalPrice());
                System.out.println(orderGroup.getRevAddress());
                System.out.println(orderGroup.getRevName());

                System.out.println("주문 상세");
                orderGroup.getOrderDetailList().stream().forEach(orderDetail -> {
                    System.out.println("주문 상태 : " + orderDetail.getStatus());
                    System.out.println("도착 예정 일자 : " + orderDetail.getArrivalDate());
                });
            });
        }

    }
}