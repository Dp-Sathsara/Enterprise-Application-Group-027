package com.example.votingsystem.model;

import jakarta.persistence.*;

@Entity
public class Voter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Voter(Long id, String password, String username) {
        this.id = id;
        this.password = password;
        this.username = username;
    }

    public Voter() {
    }
}