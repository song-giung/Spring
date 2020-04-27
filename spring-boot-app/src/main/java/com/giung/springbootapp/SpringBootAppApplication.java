package com.giung.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringBootAppApplication.class);
        app.run(args);
    }

}
