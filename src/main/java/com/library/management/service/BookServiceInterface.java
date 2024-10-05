package com.library.management.service;

import com.library.management.entity.Book;

import java.util.List;

public interface BookServiceInterface {
    Book addBook(Book book);

    Book findBookById(int bookId);

    Book findBookByISBN(String isbn);

    Book findBookByTitle(String title);

    Book updateBook(Book book);

    List<Book> getAllBooks();

    void deleteBook(int bookId);
    List<Book> findByAuthor(String author);
};