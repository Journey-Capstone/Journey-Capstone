package com.journey.journeycapstone.models;

import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long isbn;

    private String title;

    private String author;


    private long published_date;

    private String image;

    @Column(length = 2500)
    private String description;

    private long page_count;

    private String language;

    private String API_id;

    private String google_url;

    private String genre;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "book")
    private List<Review> reviews;




//    @OneToOne
//    @JoinColumn(name = "book_id")
//    private BookList bookList;

//    @OneToOne
//    private Author author;

//    @ManyToMany(cascade = CascadeType.ALL)
//        @JoinTable(
//                name = "books_genres",
//                joinColumns = {@JoinColumn(name = "book_id")},
//                inverseJoinColumns = {@JoinColumn(name = "genre_id")}
//        )
//    private List<Genre> bookGenres;
//
//    public List<Genre> getBookGenres() {
//        return bookGenres;
//    }

//    public void setBookGenres(List<Genre> bookGenres) {
//        this.bookGenres = bookGenres;
//    }

    public Book(){
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

//    public BookList getBookList() {
//        return bookList;
//    }
//
//    public void setBookList(BookList bookList) {
//        this.bookList = bookList;
//    }

//    public Author getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(Author author) {
//        this.author = author;
//    }

    public long getPublished_date() {
        return published_date;
    }

    public void setPublished_date(long published_date) {
        this.published_date = published_date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPage_count() {
        return page_count;
    }

    public void setPage_count(long page_count) {
        this.page_count = page_count;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getApiId() {
        return API_id;
    }

    public void setApiId(String apiId) {
        this.API_id = apiId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGoogle_url() {
        return google_url;
    }

    public void setGoogle_url(String google_url) {
        this.google_url = google_url;
    }
}
