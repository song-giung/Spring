package com.admin.springbootadmin.repository;

import com.admin.springbootadmin.SpringBootAdminApplicationTests;
import com.admin.springbootadmin.model.entity.AdminUser;
import com.admin.springbootadmin.model.enumClass.AdminUserRole;
import com.admin.springbootadmin.model.enumClass.UserStatus;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class AdminUserRepositoryTest extends SpringBootAdminApplicationTests {

    @Autowired
    private AdminUserRepository adminUserRepository;

    @Test
    public void create() {
        AdminUser adminUser = new AdminUser();

        adminUser.setAccount("adminUser02");
        adminUser.setPassword("adminUser02");
        adminUser.setStatus(UserStatus.REGISTERED);
        adminUser.setRole(AdminUserRole.SUPER);
        /*adminUser.setCreatedAt(LocalDateTime.now());
        adminUser.setCreatedBy("admin");*/

        AdminUser newAdminUser = adminUserRepository.save(adminUser);

        newAdminUser.setAccount("changeAccount");
        adminUserRepository.save(newAdminUser );

        Assert.assertNotNull(newAdminUser);
    }
}