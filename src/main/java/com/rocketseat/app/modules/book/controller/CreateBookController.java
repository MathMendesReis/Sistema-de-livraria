package com.rocketseat.app.modules.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocketseat.app.modules.author.entitie.Author;
import com.rocketseat.app.modules.author.repository.AuthorRepository;
import com.rocketseat.app.modules.book.dto.CreateBookDTO;
import com.rocketseat.app.modules.book.entitie.Book;
import com.rocketseat.app.modules.book.repository.BookRepository;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class CreateBookController {
  @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @PostMapping
    public ResponseEntity<?> handle(@RequestBody CreateBookDTO bookDTO){
        List<Author> authors = authorRepository.findAllById(bookDTO.getAuthorIds());
        Book book = new Book(bookDTO.getTitulo(), authors, bookDTO.getDisponivel());
        this.bookRepository.save(book);
      return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
