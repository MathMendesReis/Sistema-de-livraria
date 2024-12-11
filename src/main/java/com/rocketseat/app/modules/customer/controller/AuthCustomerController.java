package com.rocketseat.app.modules.customer.controller;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocketseat.app.modules.customer.dto.AuthCustomerRequestDTO;
import com.rocketseat.app.modules.customer.entitie.CustomerEntitie;
import com.rocketseat.app.modules.customer.repositorie.CustomerRepository;
import com.rocketseat.app.modules.customer.utils.GenarationToken;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/customer/auth")
public class AuthCustomerController {
  @Autowired
  private GenarationToken tokenGenerator;

  @Autowired
  private CustomerRepository customerRepository;
  @PostMapping()
  public ResponseEntity<?> handle(@RequestBody AuthCustomerRequestDTO request){
    Optional<CustomerEntitie>  customer = this.customerRepository.findByEmail(request.getEmail());
    if(!customer.isPresent()){
      return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
    String token = "Bearer " + tokenGenerator.generateToken(10,customer.get());
    return new ResponseEntity<>(token,HttpStatus.OK);
  }
  
  
}
