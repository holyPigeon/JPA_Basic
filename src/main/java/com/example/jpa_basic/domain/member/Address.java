package com.example.jpa_basic.domain.member;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter @Setter
public class Address {

  private String city;

  private String street;

  private String zipcode;
}