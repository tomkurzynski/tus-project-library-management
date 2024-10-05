package com.library.management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public final class Magazine extends LibraryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long magazineId;

    @Getter
    @Setter
    private int issueNumber;

    public Magazine() {
        super();
    }

    public Magazine(String title, String author, int issueNumber, String status) {
        super(title, author, status);
        this.issueNumber = issueNumber;
    }
}
