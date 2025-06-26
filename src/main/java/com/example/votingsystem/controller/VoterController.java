package com.example.votingsystem.controller;

import com.example.votingsystem.model.Voter;
import com.example.votingsystem.repository.VoterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/voters")
public class VoterController {

    @Autowired
    private VoterRepository voterRepo;

    @PostMapping("/login")
    public String login(@RequestBody Voter voter) {
        Optional<Voter> found = voterRepo.findAll().stream()
                .filter(v -> v.getUsername().equals(voter.getUsername()) &&
                        v.getPassword().equals(voter.getPassword()))
                .findFirst();
        return found.isPresent() ? "Login Successful" : "Invalid Credentials";
    }
}