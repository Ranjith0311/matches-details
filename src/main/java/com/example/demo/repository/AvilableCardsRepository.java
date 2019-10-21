package com.example.demo.repository;

import com.example.demo.model1.AvilableCards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AvilableCardsRepository extends JpaRepository<AvilableCards,Long> {
    Optional<AvilableCards> findById(Long matchId);
}