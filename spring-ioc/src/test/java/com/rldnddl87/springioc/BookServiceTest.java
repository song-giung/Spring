package com.rldnddl87.springioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceTest {


    //BookRepository의 구현 없이 BookService의 save 메서드를 테스트 할 수없다 의존성이 있기 때문에
    @Test
    public void save() {
        Book book = new Book();

        BookRepository bookRepository = new BookRepository();
        BookService bookService = new BookService(bookRepository);

        Book result = bookService.save(book);

        assertThat(book.getCreated()).isNotNull();
        assertThat(book.getBookStatus()).isEqualTo(BookStatus.DRAFT);
        assertThat(result).isNotNull();

    }
}