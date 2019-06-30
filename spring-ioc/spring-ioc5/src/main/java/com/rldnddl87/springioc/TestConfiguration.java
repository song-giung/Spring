package com.rldnddl87.springioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfiguration {

    @Bean //여기에 @Profile("test")를 주어도 된다.
    public BookRepository bookRepository() {
        return new TestBookRepository();
    }
}
