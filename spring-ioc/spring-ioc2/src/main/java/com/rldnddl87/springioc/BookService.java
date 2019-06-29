package com.rldnddl87.springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class BookService {


    BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
       this.bookRepository = bookRepository;
    }
}
