package com.journey.journeycapstone.models;

import javax.persistence.*;

@Entity
@Table(name = "status")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String status;

    private boolean isAFavorite;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isAFavorite() {
        return isAFavorite;
    }

    public void setAFavorite(boolean AFavorite) {
        isAFavorite = AFavorite;
    }
}
