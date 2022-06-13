package com.journey.journeycapstone.models;

import javax.persistence.*;

@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bookTitle;

    private String reviewTitle;

    private long rating;

    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    public Review(){
    }

    public Review(Long id,String bookTitle, String reviewTitle, Long rating, String description){
        this.id = id;
        this.bookTitle = bookTitle;
        this.reviewTitle = reviewTitle;
        this.rating = rating;
        this.description = description;
    }

    public Review(String bookTitle, String reviewTitle, Long rating, String description){
        this.bookTitle = bookTitle;
        this.reviewTitle = reviewTitle;
        this.rating = rating;
        this.description = description;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String book_title) {
        this.bookTitle = book_title;
    }

    public String getReviewTitle() {
        return reviewTitle;
    }

    public void setReviewTitle(String reviewTitle) {
        this.reviewTitle = reviewTitle;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
