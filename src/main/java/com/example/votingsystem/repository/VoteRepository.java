package com.example.votingsystem.repository;

import com.example.votingsystem.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {}
