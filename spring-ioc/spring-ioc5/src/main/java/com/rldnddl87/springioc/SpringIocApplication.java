package com.rldnddl87.springioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
public class SpringIocApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringIocApplication.class, args);
    }

}
