package com.library.management.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Member extends Person {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberId;

    @Setter
    @Getter
    @OneToMany
    private List<Book> borrowedBooks = new ArrayList<>();

    public Member() {}

    public Member(String firstName, String lastName, String email) {
        super(firstName, lastName, email);
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }
}
