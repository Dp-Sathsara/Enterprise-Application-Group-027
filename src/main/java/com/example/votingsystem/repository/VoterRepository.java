package com.example.votingsystem.repository;

import com.example.votingsystem.model.Voter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoterRepository extends JpaRepository<Voter, Long> {}
