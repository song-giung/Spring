package com.admin.springbootadmin.repository;

import com.admin.springbootadmin.SpringBootAdminApplicationTests;
import com.admin.springbootadmin.model.entity.Category;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.Assert.*;

public class CategoryRepositoryTest extends SpringBootAdminApplicationTests {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void create() {
        String type = "COMPUTER";
        String title = "컴퓨터";
        LocalDateTime createdAt = LocalDateTime.now();
        String createdBy = "adminServer";

        Category category = new Category();
        category.setTitle(title);
        category.setType(type);
        category.setCreatedAt(createdAt);
        category.setCreatedBy(createdBy);

        Category newCategory = categoryRepository.save(category);

        Assert.assertNotNull(newCategory);
        Assert.assertEquals(newCategory.getType(), type);
    }

    @Test
    public void read() {
        Optional<Category> category = categoryRepository.findByType("COMPUTER");

        if(category.isPresent()) {
            System.out.println(category.get().getType());
            System.out.println("success");
        }
    }
}