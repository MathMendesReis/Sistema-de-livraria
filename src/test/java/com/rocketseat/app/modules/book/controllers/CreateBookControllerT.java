package com.rocketseat.app.modules.book.controllers;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rocketseat.app.modules.book.dto.CreateBookDTO;

@SpringBootTest
@AutoConfigureMockMvc
public class CreateBookControllerT {
  
  @Autowired
  private MockMvc mvc;

  ObjectMapper mapper = new ObjectMapper();

  @Test
  public void It_must_be_possible_to_save_a_book() throws Exception{
    CreateBookDTO request = new CreateBookDTO();
    Set<UUID> authorsId = new HashSet<UUID>();
    authorsId.add(UUID.fromString("123e4567-e89b-12d3-a456-426614174000"));
    request.setTitulo("teste");
    request.setAuthorIds(authorsId);
    var res  = mvc.perform(MockMvcRequestBuilders.post("/api/books")
    .contentType(MediaType.APPLICATION_JSON) 
    .content(mapper.writeValueAsString(request))
    );
    System.out.println(res);
  }
}
