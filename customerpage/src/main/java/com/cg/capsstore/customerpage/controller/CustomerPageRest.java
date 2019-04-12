package com.cg.capsstore.customerpage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.capsstore.customerpage.entities.Address;
import com.cg.capsstore.customerpage.entities.Card;
import com.cg.capsstore.customerpage.entities.Customer;
import com.cg.capsstore.customerpage.entities.OrderDetails;
import com.cg.capsstore.customerpage.service.ICustomerPageService;

@RestController
public class CustomerPageRest {
    
	@Autowired
	ICustomerPageService  custpageservice;

	public ICustomerPageService getCustpageservice() {
		return custpageservice;
	}

	public void setCustpageservice(ICustomerPageService custpageservice) {
		this.custpageservice = custpageservice;
	}
	
	@GetMapping("/{cId}")
	public String showCustomer(@PathVariable("cId") int cId)
	{
		
		Customer customer=custpageservice.showCustomer(cId);

		return customer.toString() ;
	
	}
	@PostMapping("/{cId}")
	public boolean updateCustomer(@PathVariable("cId") int cId,@RequestBody Customer customer) {
		return custpageservice.updateCustomer(cId,customer);
		
	}
	
	@GetMapping("/order/{customerId}")
	public List<OrderDetails> getOrders(@PathVariable("customerId") int cId)
	{
		return custpageservice.getOrders(cId);
		
	}
	@PostMapping("/address/{cId}")
	public boolean updateAddress(@PathVariable("cId") int cId,@RequestBody Address address) {
		return custpageservice.updateAddress(cId, address);
	}
	@PostMapping("/card/{cId}")
	public boolean updateCard(@PathVariable("cId") int cId,@RequestBody Card card) {
		return custpageservice.updateCard(cId, card);
	}
}

