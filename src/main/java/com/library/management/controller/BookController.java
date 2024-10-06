package com.library.management.controller;

import com.library.management.entity.Book;
import com.library.management.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") int id) {
        return bookService.findBookById(id);
    }

    @GetMapping("/isbn/{isbn}")
    public Book getBookByIsbn(@PathVariable("isbn") String isbn) {
        return bookService.findBookByISBN(isbn);
    }

    @GetMapping("/title/{title}")
    public Book getBookByTitle(@PathVariable("title") String title) {
        return bookService.findBookByTitle(title);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/all/{author}")
    public List<Book> getAllBooksByAuthor(@PathVariable("author") String author) {
        return bookService.findByAuthor(author);
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable("id") int id) {
        bookService.deleteBook(id);
    }
}
