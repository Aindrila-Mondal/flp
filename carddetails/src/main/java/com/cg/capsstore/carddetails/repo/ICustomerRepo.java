package com.cg.capsstore.carddetails.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.capsstore.carddetails.entities.Customer;

public interface ICustomerRepo extends JpaRepository<Customer, Integer>{

}
