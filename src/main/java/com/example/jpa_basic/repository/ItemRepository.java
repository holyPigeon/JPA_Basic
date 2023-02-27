package com.example.jpa_basic.repository;

import com.example.jpa_basic.domain.item.Item;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ItemRepository {

  private EntityManager em;

  public void save(Item item) {
    em.persist(item);
  }
}
