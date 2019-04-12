package com.cg.capsstore.carddetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.capsstore.carddetails.entities.Card;
import com.cg.capsstore.carddetails.service.ICardService;

@RestController
public class CardDetailsRest {

	@Autowired
	ICardService cardService;

	public ICardService getCardService() {
		return cardService;
	}

	public void setCardService(ICardService cardService) {
		this.cardService = cardService;
	}
	
	@PostMapping("/{customerId}")
	public int addCard(@PathVariable("customerId") int customerId, @RequestBody  Card card) {
		return cardService.addCard(customerId, card);
	}
}
