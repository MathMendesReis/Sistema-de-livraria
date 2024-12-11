package com.rocketseat.app.modules.customer.entitie;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.rocketseat.app.modules.customer.dto.RegisterCustomerRequestDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_tb")

public class CustomerEntitie {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  private String name;
  @Column(name = "email", unique = true)
  private String email;
  @Column(name = "date_of_birth")
  private String DateOfbirth;
  public CustomerEntitie(String name, String email, String dateOfbirth) {
    this.setName(name);
    this.setEmail(email);
    this.setDateOfbirth(dateOfbirth);
  }
  public CustomerEntitie(RegisterCustomerRequestDTO registerCustomerRequestDTO) {
    this.setName(registerCustomerRequestDTO.getName());
    this.setEmail(registerCustomerRequestDTO.getEmail());
    this.setDateOfbirth(registerCustomerRequestDTO.getName());
  }
  public CustomerEntitie() {
  }
  public UUID getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public String getEmail() {
    return email;
  }
  public String getDateOfbirth() {
    return DateOfbirth;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public void setDateOfbirth(String dateOfbirth) {
    DateOfbirth = dateOfbirth;
  }

   
 
}
