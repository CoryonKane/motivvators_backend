package com.codecool.motivators.repository;

import com.codecool.motivators.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
