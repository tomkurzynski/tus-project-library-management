package com.library.management.repository;

import com.library.management.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Integer> {
    Optional<Book> findByTitle(String title);
    List<Book> findByAuthor(String author);
    Optional<Book> findByIsbn(String isbn);
    List<Book> getAllBooks();

}
