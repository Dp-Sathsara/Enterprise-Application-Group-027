package com.example.votingsystem.controller;

import com.example.votingsystem.model.Vote;
import com.example.votingsystem.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/results")
public class ResultController {

    @Autowired
    private VoteRepository voteRepo;

    @GetMapping("/{electionId}")
    public Map<Long, Long> getResults(@PathVariable Long electionId) {
        return voteRepo.findAll().stream()
                .filter(v -> v.getElectionId().equals(electionId))
                .collect(Collectors.groupingBy(Vote::getCandidateId, Collectors.counting()));
    }
}