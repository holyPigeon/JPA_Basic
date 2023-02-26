package com.example.jpa_basic.domain.member;

import com.example.jpa_basic.domain.Order;
import com.example.jpa_basic.domain.item.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member extends BaseEntity {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "MEMBER_ID")
  private Long id;

  private String name;

  @Embedded
  private Period period;

  @Embedded
  private Address address;

  @OneToMany(mappedBy = "member")
  private List<Order> orders = new ArrayList<>();

  //== 연관관게 편의 메소드 ==//
  public void addOrder(Order order) {
    orders.add(order);
    order.setMember(this);
  }
}
