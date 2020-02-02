package com.admin.springbootadmin.sample;


import com.admin.springbootadmin.SpringBootAdminApplicationTests;
import com.admin.springbootadmin.model.entity.Category;
import com.admin.springbootadmin.model.enumClass.CategoryType;
import com.admin.springbootadmin.repository.CategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class CategorySample extends SpringBootAdminApplicationTests {

    @Autowired
    private CategoryRepository categoryRepository;


    @Test
    public void createSample(){

        for(int i = 0; i < CategoryType.values().length; i++){
            CategoryType c = CategoryType.getById(i);
            String t = c.getTitle();
            Category create = Category.builder().type(c).title(t).build();
            categoryRepository.save(create);
        }


    }

}
