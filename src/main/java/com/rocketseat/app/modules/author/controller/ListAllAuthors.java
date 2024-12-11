package com.rocketseat.app.modules.author.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocketseat.app.modules.author.repository.AuthorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/authors")
public class ListAllAuthors {
  
  @Autowired
  private AuthorRepository authorRepository;
  @GetMapping()
  public ResponseEntity<?> handle() {
    var res = this.authorRepository.findAll();
    return new ResponseEntity<>(res,HttpStatus.OK);
  }
  
}
