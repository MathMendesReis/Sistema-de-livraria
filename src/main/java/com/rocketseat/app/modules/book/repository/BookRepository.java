package com.rocketseat.app.modules.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocketseat.app.modules.book.entitie.Book;
import java.util.UUID;
public interface BookRepository extends JpaRepository<Book, UUID> {
  
}
