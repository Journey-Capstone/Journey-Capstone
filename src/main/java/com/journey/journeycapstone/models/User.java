package com.journey.journeycapstone.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

//    Copy Constructor for authentication process
//    used in order to fulfill the contract defined by the interfaces in the security package.
    public User(User copy){
        id = copy.id; //Super important!!!!
        email = copy.email;
        username = copy.username;
        password = copy.password;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 30)
    private String first_name;

    @Column(nullable = false, length = 30)
    private String last_name;

    @Column(nullable = false, length = 30)
    private String username;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false, length = 200)
    private String password;

    @Column(nullable = false)
    private boolean is_subscribed;


    //with favorite Genre the nullable needed to be true,
    // because in the beginning when the user is creating a User
    // they are not asked for genre so this need to be null until
    // user is in settings.
//    @Column(nullable = false, length = 30)
    @Column(nullable = true, length = 30)
    private String favorite_genre;

    @Column(length = 40)
    private String City;

    @Column(length = 30)
    private String State;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Review> reviews;

    public User() {
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public boolean getIs_subscribed() {
        return is_subscribed;
    }

    public void setIs_subscribed(boolean is_subscribed) {
        this.is_subscribed = is_subscribed;
    }

    public String getFavorite_genre() {
        return favorite_genre;
    }

    public void setFavorite_genre(String favorite_genre) {
        this.favorite_genre = favorite_genre;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

