package me.rldnd.demowebmvc.book;

import com.fasterxml.jackson.annotation.JsonView;

import java.util.Date;

public class Author {

    @JsonView(BookJsonView.Complex.class)
    private Long id;

    @JsonView(BookJsonView.Complex.class)
    private String firstName;

    @JsonView(BookJsonView.Complex.class)
    private String lastName;

    private String email;

    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getJoindAt() {
        return joindAt;
    }

    public void setJoindAt(Date joindAt) {
        this.joindAt = joindAt;
    }

    private Date joindAt;

}
