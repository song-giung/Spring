package com.giung.springbootapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private Logger logger = LoggerFactory.getLogger(AppRunner.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("-=-=-=-=-=-=-=-=-=-==-=-=");
        System.out.println(hello);
        System.out.println(properties.getName());
    }
}
