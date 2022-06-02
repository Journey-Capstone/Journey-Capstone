package com.journey.journeycapstone.models;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long isbn;

    private String title;

    private long author_id;

    private long published_date;

    private String image;

    private String description;

    private long page_count;

    private String language;

    private String amazon_url;

    private String google_url;

    public Book(){
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

    public long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(long author_id) {
        this.author_id = author_id;
    }

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

    public String getAmazon_url() {
        return amazon_url;
    }

    public void setAmazon_url(String amazon_url) {
        this.amazon_url = amazon_url;
    }

    public String getGoogle_url() {
        return google_url;
    }

    public void setGoogle_url(String google_url) {
        this.google_url = google_url;
    }
}
