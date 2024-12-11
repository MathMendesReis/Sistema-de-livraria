package com.rocketseat.app.modules.customer.repositorie;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocketseat.app.modules.customer.entitie.CustomerEntitie;

public interface CustomerRepository extends JpaRepository<CustomerEntitie,UUID>{
  Optional<CustomerEntitie> findByEmail(String email);
  
}
