package me.rldnd.demowebmvc.book;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    @JsonView(BookJsonView.Simple.class)
    public List<Book> getBooks() {
        return books();
    }

    private List<Book> books() {
        Author giung = new Author();

        giung.setFirstName("giung");
        giung.setLastName("song");
        giung.setEmail("rldnddl87@gmail.com");
        giung.setId(100l);
        giung.setAddress("Seoul");
        giung.setJoindAt(new Date());

        Book book = new Book();
        book.setId(1l);
        book.setTitle("spring book");
        book.setIsbn("gasdf");
        book.setPublished(new Date());
        book.addAuthor(giung);

        return Arrays.asList(book);
    }
}
