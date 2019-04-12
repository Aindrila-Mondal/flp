package com.cg.capsstore.customerpage.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import com.cg.capsstore.customerpage.entities.Address;
import com.cg.capsstore.customerpage.entities.Card;
import com.cg.capsstore.customerpage.entities.Customer;
import com.cg.capsstore.customerpage.entities.OrderDetails;

public interface ICustomerPageService {

	public Customer showCustomer(int cId);

	

	public List<OrderDetails> getOrders(int cId);

	boolean updateCustomer(int cId, Customer customer);
	
	boolean updateAddress(int cId, Address address);
	
	boolean updateCard(int cId, Card card);
  
}
