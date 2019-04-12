package com.cg.capsstore.customerpage.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.capsstore.customerpage.entities.OrderedProduct;


public interface ICustomerPageOrderedProductRepo  extends JpaRepository<OrderedProduct, Integer> {

}
