package com.rldnddl87.springioc;

public class BookService {

    BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
       this.bookRepository = bookRepository;
    }
}
