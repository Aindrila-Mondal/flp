package com.cg.capsstore.carddetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.capsstore.carddetails.entities.Card;
import com.cg.capsstore.carddetails.entities.Customer;
import com.cg.capsstore.carddetails.repo.ICardRepo;
import com.cg.capsstore.carddetails.repo.ICustomerRepo;

@Service
public class CardServiceImpl implements ICardService {

	@Autowired
	ICardRepo cardRepo;

	@Autowired
	ICustomerRepo customerRepo;

	public ICardRepo getCardRepo() {
		return cardRepo;
	}

	public void setCardRepo(ICardRepo cardRepo) {
		this.cardRepo = cardRepo;
	}

	public ICustomerRepo getCustomerRepo() {
		return customerRepo;
	}

	public void setCustomerRepo(ICustomerRepo customerRepo) {
		this.customerRepo = customerRepo;
	}

	@Override
	public int addCard(int customerId, Card card) {
		// TODO Auto-generated method stub
		Customer customer = customerRepo.getOne(customerId);
		customer.setCustomerCard(card);
		cardRepo.save(card);
		customerRepo.save(customer);
		return card.getCardId();
	}

}
