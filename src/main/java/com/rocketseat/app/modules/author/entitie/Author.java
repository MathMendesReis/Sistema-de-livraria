package com.rocketseat.app.modules.author.entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import java.time.LocalDateTime;

@Entity
@Table(name="author_tb")
public class Author {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  private String nome;
  private LocalDateTime dataNascimentoAutor;
  public Author(String nome, LocalDateTime dataNascimentoAutor) {
    this.nome = nome;
    this.dataNascimentoAutor = dataNascimentoAutor;
  }
  public Author() {
  }
  public UUID getId() {
    return id;
  }
  public String getNome() {
    return nome;
  }
  public LocalDateTime getDataNascimentoAutor() {
    return dataNascimentoAutor;
  }
}
