package com.rocketseat.app.modules.author.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocketseat.app.modules.author.entitie.Author;

import java.util.UUID;
import java.util.List;
public interface AuthorRepository extends JpaRepository<Author, UUID>{
  List<Author> findAllById(Iterable<UUID> ids);

}
