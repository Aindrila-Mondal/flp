package com.cg.capsstore.customerpage.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.capsstore.customerpage.entities.Product;

public interface ICustomerPageProductRepo extends JpaRepository<Product, Integer>{

}
