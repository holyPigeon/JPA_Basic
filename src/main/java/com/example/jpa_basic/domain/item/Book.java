package com.example.jpa_basic.domain.item;

import jakarta.persistence.Entity;

@Entity
public class Book extends Item {

  private String author;
  private String isbn;
}
