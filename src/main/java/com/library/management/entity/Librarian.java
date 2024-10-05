package com.library.management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public final class Librarian extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int librarianId;

    public Librarian() {
        super();
    }

    public Librarian(String firstName, String lastName, String email) {
        super(firstName, lastName, email);
    }
}
