package com.rocketseat.app.modules.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocketseat.app.modules.book.entitie.Book;
import com.rocketseat.app.modules.book.repository.BookRepository;

@RestController
@RequestMapping("/api/books")
public class ListAllBooksController {
  @Autowired
  private BookRepository bookRepository;
  
  @GetMapping
  public ResponseEntity<?> handle(){
    List<Book> books = this.bookRepository.findAll();
    return new ResponseEntity<>(books,HttpStatus.OK);
  }
}
