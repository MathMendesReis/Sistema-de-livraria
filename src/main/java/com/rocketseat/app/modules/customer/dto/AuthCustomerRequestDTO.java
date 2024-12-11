package com.rocketseat.app.modules.customer.dto;

public class AuthCustomerRequestDTO {
  private String email;

  public AuthCustomerRequestDTO(String email) {
    setEmail(email);
  }

  public AuthCustomerRequestDTO() {
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
}
