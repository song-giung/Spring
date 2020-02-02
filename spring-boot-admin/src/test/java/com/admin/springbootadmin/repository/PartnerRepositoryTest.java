package com.admin.springbootadmin.repository;

import com.admin.springbootadmin.SpringBootAdminApplicationTests;
import com.admin.springbootadmin.model.entity.Partner;
import com.admin.springbootadmin.model.enumClass.PartnerStatus;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.Part;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class PartnerRepositoryTest extends SpringBootAdminApplicationTests {

    @Autowired
    PartnerRepository partnerRepository;

    @Test
    public void create() {
        String name = "TestName";
        String status = "REGISTERED";
        String address = "서울시 강남구";
        String callCenter = "070-123-1234";
        String partnerNumber = "010-1234-1234";
        String businessNumber = "1234567899123";
        String ceoName = "홍길동";
        Long categoryId = 1L;
        LocalDateTime registeredAt = LocalDateTime.now();
        LocalDateTime createdAt = LocalDateTime.now();
        String createdBy = "adminServer";

        Partner partner = new Partner();
        partner.setName(name);
        partner.setStatus(PartnerStatus.REGISTERED);
        partner.setAddress(address);
        partner.setCallCenter(callCenter);
        partner.setPartnerNumber(partnerNumber);
        partner.setBusinessNumber(businessNumber);
        partner.setCeoName(ceoName);
        partner.setRegisteredAt(registeredAt);
        partner.setCreatedAt(createdAt);
        partner.setCreatedBy(createdBy);
        //partner.setCategoryId(categoryId);

        Partner newPartner = partnerRepository.save(partner);

        Assert.assertNotNull(newPartner);
        Assert.assertEquals(newPartner.getName(),name);

    }

    @Test
    public void read() {

    }

}