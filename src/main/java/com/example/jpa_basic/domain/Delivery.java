package com.example.jpa_basic.domain;

import com.example.jpa_basic.domain.item.BaseEntity;
import com.example.jpa_basic.domain.member.Address;
import jakarta.persistence.*;

@Entity
public class Delivery extends BaseEntity {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "DELIVERY_ID")
  private Long id;

  private String city;

  private String street;

  private String zipcode;

  @Embedded
  private Address address;

  @Enumerated(EnumType.STRING)
  private DeliveryStatus status;

  @OneToOne(mappedBy = "delivery", fetch = FetchType.LAZY)
  private Order order;
}
