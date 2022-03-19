package com.escape.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escape.crud.model.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long>{

}
