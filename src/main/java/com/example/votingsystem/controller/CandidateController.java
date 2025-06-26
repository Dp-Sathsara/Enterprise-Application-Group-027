package com.example.votingsystem.controller;

import com.example.votingsystem.model.Candidate;
import com.example.votingsystem.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

    @Autowired
    private CandidateRepository candidateRepo;

    @GetMapping("/{electionId}")
    public List<Candidate> getCandidatesByElection(@PathVariable Long electionId) {
        return candidateRepo.findAll().stream()
                .filter(c -> c.getElectionId().equals(electionId))
                .toList();
    }
}