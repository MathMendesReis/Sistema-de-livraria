package com.rocketseat.app.modules.book.entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.UUID;
import java.util.List;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.rocketseat.app.modules.author.entitie.Author;

import java.time.LocalDateTime;

@Entity
@Table(name = "book_tb")
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  private String titulo;
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  @ManyToMany
  @JoinTable(
    name = "book_author",  
    joinColumns = @JoinColumn(name = "book_id"), 
    inverseJoinColumns = @JoinColumn(name = "author_id")
  )
  private List<Author> autor;
  public List<Author> getAutor() {
    return autor;
  }
  public void setautor(List<Author> autor) {
    this.autor = autor;
  }
  private Boolean disponivel;
  public void setDisponivel(Boolean disponivel) {
    this.disponivel = disponivel;
  }
  @CreationTimestamp
  private LocalDateTime dataCadastro;
  @UpdateTimestamp
  private LocalDateTime dataAtualização;
  public Book(String titulo, List<Author> autor, Boolean disponivel) {
    this.titulo = titulo;
    this.autor = autor;
    this.disponivel = disponivel;
  }
  public Book() {
  }
  public UUID getId() {
    return id;
  }
  public String getTitulo() {
    return titulo;
  }
  
  public Boolean getDisponivel() {
    return disponivel;
  }
  public LocalDateTime getDataCadastro() {
    return dataCadastro;
  }
  public LocalDateTime getDataAtualização() {
    return dataAtualização;
  }


}
