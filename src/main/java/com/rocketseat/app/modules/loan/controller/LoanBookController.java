package com.rocketseat.app.modules.loan.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocketseat.app.modules.book.repository.BookRepository;
import com.rocketseat.app.modules.loan.entitie.LoanEntitie;
import com.rocketseat.app.modules.loan.repository.LoanRepository;

@RestController
@RequestMapping("/api/books/loan")
public class LoanBookController {
  @Autowired
    private BookRepository bookRepository;

    @Autowired
    private LoanRepository loanRepository;

    @PostMapping
    public ResponseEntity<?> handle(){
      var bookExists = this.bookRepository.findById(UUID.fromString("34e5b7b9-3715-47cc-8a2f-6fae61777314"));

      boolean isAvailable = bookExists.get().getDisponivel() == true;

      if(!isAvailable){
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
      }

      bookExists.get().setDisponivel(false);
      this.bookRepository.save(bookExists.get());

      LoanEntitie loanEntitie = new LoanEntitie(UUID.fromString("34e5b7b9-3715-47cc-8a2f-6fae61777314"),UUID.fromString("34e5b7b9-3715-47cc-8a2f-6fae61777314"));

      this.loanRepository.save(loanEntitie);

      return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
