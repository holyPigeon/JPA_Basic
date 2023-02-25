package com.example.jpa_basic.domain.item;

import jakarta.persistence.Entity;

@Entity
public class Album extends Item {

  private String artist;
}
