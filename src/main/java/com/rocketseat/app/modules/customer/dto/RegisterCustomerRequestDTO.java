package com.rocketseat.app.modules.customer.dto;


public class RegisterCustomerRequestDTO {
  private String name;
  private String email;
  private String dateOfbirth;
  public RegisterCustomerRequestDTO(String name, String email, String dateOfbirth) {
    this.name = name;
    this.email = email;
    this.dateOfbirth = dateOfbirth;
  }
  public RegisterCustomerRequestDTO() {
  }
  public String getName() {
    return name;
  }
  public String getEmail() {
    return email;
  }
  public String getDateOfbirth() {
    return dateOfbirth;
  }
}
