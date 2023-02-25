package com.example.jpa_basic.domain.item;

import jakarta.persistence.Entity;

@Entity
public class Movie extends Item {

  private String director;
  private String author;
}
