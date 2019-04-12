package com.cg.capsstore.customerpage.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.capsstore.customerpage.entities.Customer;

public interface ICustomerPageCustomerRepo  extends JpaRepository<Customer, Integer> {

}
