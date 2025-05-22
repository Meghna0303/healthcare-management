package com.meghana.healthcare.healthcaremanagement.repository;

import com.meghana.healthcare.healthcaremanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // You get built-in CRUD methods here (save, findAll, findById, deleteById, etc.)
    // You can add custom methods later, e.g.:
    // Optional<User> findByUsername(String username);
}
