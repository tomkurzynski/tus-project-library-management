package com.library.management.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public final class Book extends LibraryItem{

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    @Getter
    @Setter
    private String isbn;

    public Book(){
        super();
    }

    public Book(String title, String author, String isbn) {
        super(title, author);
        this.isbn = isbn;
    }
}

//enum BookStatus {
//    AVAILABLE,
//    BORROWED,
//    RESERVED
//}

