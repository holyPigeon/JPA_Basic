package com.example.jpa_basic.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Item {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ITEM ID")
  private Long id;

  private String name;

  private int price;

  private int stockQuantity;


}
