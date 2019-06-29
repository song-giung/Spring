package com.rldnddl87.springioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public BookRepository bookRepository() {
        return new BookRepository();
    }

    @Bean
    public BookService bookService() {
        BookService bookservice = new BookService();
        bookservice.setBookRepository((bookRepository()));
        return bookservice;
    }
}
