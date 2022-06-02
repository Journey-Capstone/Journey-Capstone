package com.journey.journeycapstone.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bookLists")
public class BookList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //references user(id)
    @OneToOne
    private User owner;

    //references book(id)
    @OneToMany
    private List<Book> books;

    //references status(id)
    @OneToOne
    private Status status;

    public BookList(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    public long getBook_id() {
//        return book_id;
//    }
//
//    public void setBook_id(long book_id) {
//        this.book_id = book_id;
//    }


    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
