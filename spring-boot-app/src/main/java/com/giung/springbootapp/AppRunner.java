package com.giung.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    giungProperties giungProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(giungProperties.getName());
        System.out.println(giungProperties.getFullName());
        System.out.println(giungProperties.getCity());

    }
}
