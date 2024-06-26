package com.example.LabCycle08;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")

public class BookController {
	private final List<Book> books = new ArrayList<Book>();
    @GetMapping("/get")
    public List<Book> getAllBooks() {
        return books;
    }

    @PostMapping("/add")
    public Book addBook(@RequestBody Book book) {
        books.add(book);
        return book;
    }
}