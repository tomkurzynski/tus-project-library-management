package com.library.management.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Book {
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String author;

    @Getter
    @Setter
    private String isbn;

    @Enumerated(EnumType.STRING)
    @Getter
    @Setter
    private BookStatus status;

    public Book(){}

    public Book(String title, String author, String isbn, String status) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.status = BookStatus.AVAILABLE;
    }
}

enum BookStatus {
    AVAILABLE,
    BORROWED,
    RESERVED
}

