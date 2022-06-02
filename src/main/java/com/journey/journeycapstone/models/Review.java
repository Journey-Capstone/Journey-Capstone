package com.journey.journeycapstone.models;

import javax.persistence.*;

@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private long rating;

    private String description;
    //references user(id)
    @OneToOne
    private User owner;
    //references book(id)
    @OneToOne
    private Book bookReview;

//    @ManyToOne
//    @JoinColumn(name = "review_id")
//    private Review review;

    public Review(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public long getBook_id() {
//        return book_id;
//    }
//
//    public void setBook_id(long book_id) {
//        this.book_id = book_id;
//    }
}
