package com.rocketseat.app.modules.loan.entitie;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "loan_tb")
public class LoanEntitie {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  
  @Column(name = "customer_id")
  private UUID customerId;
  @Column(name = "book_id")
  private UUID bookId;
  @Column(name = "initial_date")
  @CreationTimestamp
  private LocalDateTime initialDate;
  @Column(name = "final_date")
  private LocalDateTime finalDate;
  public LoanEntitie(UUID customerId, UUID bookId) {
    this.customerId = customerId;
    this.bookId = bookId;
    this.finalDate = LocalDateTime.now().plusDays(7);
  }
  public LoanEntitie() {
  }
  public UUID getId() {
    return id;
  }
  public UUID getCustomerId() {
    return customerId;
  }
  public UUID getBookId() {
    return bookId;
  }
  public LocalDateTime getInitialDate() {
    return initialDate;
  }
  public LocalDateTime getFinalDate() {
    return finalDate;
  }

 
}
