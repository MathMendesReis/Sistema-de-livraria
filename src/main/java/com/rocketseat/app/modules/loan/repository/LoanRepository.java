package com.rocketseat.app.modules.loan.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocketseat.app.modules.loan.entitie.LoanEntitie;

public interface LoanRepository extends JpaRepository<LoanEntitie,UUID>{
  
}
