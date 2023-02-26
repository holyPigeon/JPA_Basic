package com.example.jpa_basic.domain.member;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Embeddable
@Getter @Setter
public class Period {

  private LocalDateTime startDate;

  private LocalDateTime endDate;
}
