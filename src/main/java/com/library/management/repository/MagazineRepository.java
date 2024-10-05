package com.library.management.repository;

import com.library.management.entity.Magazine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MagazineRepository extends JpaRepository<Magazine, Integer> {
    Optional<Magazine> findByTitle(String title);
    List<Magazine> findByAuthor(String author);
}
