package com.codecool.motivators.repository;

import com.codecool.motivators.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByName (String name);
}
