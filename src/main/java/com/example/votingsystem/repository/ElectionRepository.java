package com.example.votingsystem.repository;

import com.example.votingsystem.model.Election;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectionRepository extends JpaRepository<Election, Long> {}
