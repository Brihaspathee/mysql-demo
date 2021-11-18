package com.example.mysqldemo.controller;

import com.example.mysqldemo.domain.entity.Book;
import com.example.mysqldemo.domain.repository.BookRepository;
import com.example.mysqldemo.model.BookList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/book")
@RequiredArgsConstructor
public class BookController {

    private final BookRepository bookRepository;

    @PostMapping
    public ResponseEntity createBook(@RequestBody Book book){
        bookRepository.save(book);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity getAllBooks(){
        List<Book> books = bookRepository.findAll();
        BookList bookList = BookList.builder().books(books).build();
        return new ResponseEntity(bookList, HttpStatus.OK);
    }
}
