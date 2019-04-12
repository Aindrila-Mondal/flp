package com.cg.capsstore.customerpage.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.capsstore.customerpage.entities.Address;


public interface ICustomerPageAddressRepo extends JpaRepository<Address, Integer>  {

}
