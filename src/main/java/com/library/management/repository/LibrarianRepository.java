package com.library.management.repository;

import com.library.management.entity.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LibrarianRepository extends JpaRepository<Librarian, Integer> {
    Optional<Librarian> findByEmail(String email);
    Optional<Librarian> findByLastName(String lastName);
    Optional<Librarian> findByFullName(String firstName, String lastName);
}
