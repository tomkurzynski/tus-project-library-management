package com.library.management.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract sealed class LibraryItem permits Book, Magazine{

        @Getter @Setter
        private String title;

        @Getter @Setter
        private String author;

        @Enumerated(EnumType.STRING)
        @Getter @Setter
        private BookStatus status;

        public LibraryItem() {}

        public LibraryItem(String title, String author, String status) {
                this.title = title;
                this.author = author;
                this.status = BookStatus.AVAILABLE;
        }
}

enum BookStatus {
        AVAILABLE,
        BORROWED,
        RESERVED
}