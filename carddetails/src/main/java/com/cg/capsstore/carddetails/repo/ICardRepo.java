package com.cg.capsstore.carddetails.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.capsstore.carddetails.entities.Card;

@Repository
public interface ICardRepo extends JpaRepository<Card, Integer>{

}

