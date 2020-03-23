package me.rldnd.demowebmvc.book;

import com.fasterxml.jackson.annotation.JsonView;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Book {

    @JsonView({BookJsonView.Simple.class, BookJsonView.Complex.class})
    private Long id;

    @JsonView({BookJsonView.Simple.class, BookJsonView.Complex.class})
    private String isbn;

    @JsonView(BookJsonView.class)
    private Date published;

    @JsonView(BookJsonView.class)
    private Set<Author> authors;

    @JsonView({BookJsonView.Simple.class, BookJsonView.Complex.class})
    private String title;

    Book(){
        authors = new HashSet<Author>();
    }

    public void addAuthor(Author author){
        authors.add(author);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}
