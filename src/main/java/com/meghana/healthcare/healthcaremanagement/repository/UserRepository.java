package com.meghana.healthcare.healthcaremanagement.repository;

import com.meghana.healthcare.healthcaremanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Built-in: save(), findAll(), findById(), deleteById(), etc.

    // Custom query for login/authentication:
    Optional<User> findByUsername(String username);
}

