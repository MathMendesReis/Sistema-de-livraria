package com.rocketseat.app.modules.loan.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocketseat.app.modules.book.repository.BookRepository;
import com.rocketseat.app.modules.loan.repository.LoanRepository;

@RestController
@RequestMapping("/api/books/return")
public class ReturnBookController {
  @Autowired
    private BookRepository bookRepository;

    @Autowired
    private LoanRepository loanRepository;

    @PostMapping
    public ResponseEntity<?> handle(){
      String bookId = "b87abe37-c77f-43e2-8ae8-9841083b9356";
      var loanExists = this.loanRepository.findById(UUID.fromString(bookId));
      if(!loanExists.isPresent()){
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
      var bookExists = this.bookRepository.findById(UUID.fromString(loanExists.get().getBookId().toString()));
      if(!bookExists.isPresent()){
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
      bookExists.get().setDisponivel(true);
      this.bookRepository.save(bookExists.get());
      this.loanRepository.deleteById(UUID.fromString(loanExists.get().getId().toString()));
      return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
