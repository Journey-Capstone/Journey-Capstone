package com.journey.journeycapstone.models;

import javax.persistence.*;

@Entity
@Table(name = "bookLists")
public class BookList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //references user(id)
    private long user_id;
    //references book(id)
    private long book_id;
    //references status(id)
    private long status_id;

    public BookList(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getBook_id() {
        return book_id;
    }

    public void setBook_id(long book_id) {
        this.book_id = book_id;
    }

    public long getStatus_id() {
        return status_id;
    }

    public void setStatus_id(long status_id) {
        this.status_id = status_id;
    }
}
