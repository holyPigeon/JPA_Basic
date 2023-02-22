package com.example.jpa_basic;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity // JPA를 사용해서 테이블과 매핑할 클래스
@Getter @Setter
public class Member {

  @Id
  private Long id;

  @Column(name = "name", nullable = false)
  private String username;

  @Enumerated(EnumType.STRING)
  private RoleType rolltype;

  private LocalDateTime createdDate;

  private LocalDateTime lastModifiedDate;

  @Lob
  private String description;

  public Member() {

  }
}
