package com.cg.capsstore.customerpage.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.capsstore.customerpage.entities.Card;

public interface ICustomerPageCardRepo extends JpaRepository<Card, Integer>{

}
