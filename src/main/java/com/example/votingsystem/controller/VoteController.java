package com.example.votingsystem.controller;

import com.example.votingsystem.model.Vote;
import com.example.votingsystem.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vote")
public class VoteController {

    @Autowired
    private VoteRepository voteRepo;

    @PostMapping
    public String castVote(@RequestBody Vote vote) {
        boolean alreadyVoted = voteRepo.findAll().stream()
                .anyMatch(v -> v.getVoterId().equals(vote.getVoterId()) &&
                        v.getElectionId().equals(vote.getElectionId()));
        if (alreadyVoted) {
            return "You have already voted!";
        }
        voteRepo.save(vote);
        return "Vote Cast Successfully!";
    }
}