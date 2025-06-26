package com.example.votingsystem.controller;

import com.example.votingsystem.model.Election;
import com.example.votingsystem.repository.ElectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/elections")
public class ElectionController {

    @Autowired
    private ElectionRepository electionRepo;

    @GetMapping
    public List<Election> getActiveElections() {
        return electionRepo.findAll().stream()
                .filter(e -> "Active".equalsIgnoreCase(e.getStatus()))
                .toList();
    }
}