package com.example.votingsystem.model;

import jakarta.persistence.*;

@Entity
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long electionId;
    // Getters and Setters

    public Candidate() {
    }

    public Candidate(Long id, String name, Long electionId) {
        this.id = id;
        this.name = name;
        this.electionId = electionId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getElectionId() {
        return electionId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setElectionId(Long electionId) {
        this.electionId = electionId;
    }
}