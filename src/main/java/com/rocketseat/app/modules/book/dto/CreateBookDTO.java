package com.rocketseat.app.modules.book.dto;
import java.util.Set;
import java.util.UUID;
public class CreateBookDTO {
  private String titulo;
  private Set<UUID> authorIds;
  private Boolean disponivel;

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  public void setAuthorIds(Set<UUID> authorIds) {
    this.authorIds = authorIds;
  }
  public void setDisponivel(Boolean disponivel) {
    this.disponivel = disponivel;
  }
  public String getTitulo() {
    return titulo;
  }
  public Set<UUID> getAuthorIds() {
    return authorIds;
  }
  public Boolean getDisponivel() {
    return disponivel;
  }
  public CreateBookDTO(){};
  public CreateBookDTO(String titulo, Set<UUID> authorId){
    this.titulo = titulo;
    this.authorIds = authorId;
    this.disponivel = true;
  };
  public CreateBookDTO(String titulo, Set<UUID> authorId,Boolean disponivel){
    this.titulo = titulo;
    this.authorIds = authorId;
    this.disponivel = disponivel;
  };
}
