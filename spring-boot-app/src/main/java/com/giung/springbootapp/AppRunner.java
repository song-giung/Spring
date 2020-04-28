package com.giung.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    String hello;

    @Autowired
    giungProperties properties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(hello);
        System.out.println(properties.getName());
    }
}
