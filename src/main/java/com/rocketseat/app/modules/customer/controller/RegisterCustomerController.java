package com.rocketseat.app.modules.customer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocketseat.app.modules.customer.dto.RegisterCustomerRequestDTO;
import com.rocketseat.app.modules.customer.entitie.CustomerEntitie;
import com.rocketseat.app.modules.customer.repositorie.CustomerRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/customer")
public class RegisterCustomerController {

  @Autowired
  private CustomerRepository customerRepository;

  @PostMapping()
  public ResponseEntity<?> handle(@RequestBody RegisterCustomerRequestDTO request) {
      Optional<CustomerEntitie> customerExists = customerRepository.findByEmail(request.getEmail());
      if(customerExists.isPresent()){
        return new ResponseEntity<>("User already exists.",HttpStatus.BAD_REQUEST);
      }
      CustomerEntitie customer = new CustomerEntitie(request);
      this.customerRepository.save(customer);
      return new ResponseEntity<>(HttpStatus.CREATED);
  }
  
}
