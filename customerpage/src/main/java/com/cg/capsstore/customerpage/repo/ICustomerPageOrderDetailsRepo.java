package com.cg.capsstore.customerpage.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.capsstore.customerpage.entities.OrderDetails;

public interface ICustomerPageOrderDetailsRepo  extends JpaRepository<OrderDetails, Integer>{

	

}
