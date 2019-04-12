package com.cg.capsstore.customerpage.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import com.cg.capsstore.customerpage.entities.Address;
import com.cg.capsstore.customerpage.entities.Card;
import com.cg.capsstore.customerpage.entities.Customer;
import com.cg.capsstore.customerpage.entities.OrderDetails;
import com.cg.capsstore.customerpage.repo.ICustomerPageAddressRepo;
import com.cg.capsstore.customerpage.repo.ICustomerPageCardRepo;
import com.cg.capsstore.customerpage.repo.ICustomerPageCustomerRepo;
import com.cg.capsstore.customerpage.repo.ICustomerPageOrderDetailsRepo;


@Service
@Transactional
public class CustomerPageServiceImpl implements ICustomerPageService 
{
  @Autowired
  ICustomerPageCustomerRepo custpagerepo;
  
  @Autowired
  ICustomerPageOrderDetailsRepo custpageorderdetailsrepo;

  @Autowired
ICustomerPageAddressRepo custpageaddressrepo;
  
  @Autowired
  ICustomerPageCardRepo custpagecardrepo;
  
  
	public ICustomerPageAddressRepo getCustpageaddressrepo() {
	return custpageaddressrepo;
}

public void setCustpageaddressrepo(ICustomerPageAddressRepo custpageaddressrepo) {
	this.custpageaddressrepo = custpageaddressrepo;
}

	public ICustomerPageCustomerRepo getCustpagerepo() {
	return custpagerepo;
}

public void setCustpagerepo(ICustomerPageCustomerRepo custpagerepo) {
	this.custpagerepo = custpagerepo;
}

public ICustomerPageOrderDetailsRepo getCustpageorderdetailsrepo() {
	return custpageorderdetailsrepo;
}

public void setCustpageorderdetailsrepo(ICustomerPageOrderDetailsRepo custpageorderdetailsrepo) {
	this.custpageorderdetailsrepo = custpageorderdetailsrepo;
}

	@Override
	/*to show customer profile that is customer details*/
	public Customer showCustomer(int cId)
	{
		return  custpagerepo.getOne(cId);
	
	}

    @Override
    /*to update customer profile*/
	public boolean updateCustomer(int cId,Customer customer)
	{
    	boolean flag=false;
    	Customer cust=custpagerepo.getOne(cId);
    	
    	if(customer!=null)
    	{
    		cust.setCustomerName(customer.getCustomerName());
    		cust.setCustomerMobile(customer.getCustomerMobile());
    		cust.setCustomerEmail(customer.getCustomerEmail());
    		cust.setCustomerPassword(customer.getCustomerPassword());
    		//cust.setCustomerAddresses(customer.getCustomerAddresses());
    		custpagerepo.save(cust);
    		System.out.println("@@@@@@@@@@@@@@@@@@"+cust);
    		flag=true;
    	}
    	
		return flag;
	}
  

	@Override
	/* to get all orders for a customer*/
	public List<OrderDetails> getOrders(int cId) {
		// TODO Auto-generated method stub
		List<OrderDetails> orderdetails=custpageorderdetailsrepo.findAll();
		return orderdetails;
	}

	@Override
	/*to update customer address*/
	public boolean updateAddress(int cId, Address address) 
	{
		// TODO Auto-generated method stub
		
		Customer customer=custpagerepo.getOne(cId);
		customer.setCustomerAddresses(address);
		custpageaddressrepo.save(address);
		custpagerepo.save(customer);
		return true;	
		}

	@Override
	/*to update card details*/
	public boolean updateCard(int cId, Card card) {
		Customer customer=custpagerepo.getOne(cId);
		customer.setCustomerCard(card);
		custpagecardrepo.save(card);
		custpagerepo.save(customer);
		return true;
	}
   
	
}
