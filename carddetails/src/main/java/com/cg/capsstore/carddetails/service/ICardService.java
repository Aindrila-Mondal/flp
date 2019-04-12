package com.cg.capsstore.carddetails.service;

import com.cg.capsstore.carddetails.entities.Card;

public interface ICardService {
	public int addCard(int customerId, Card card);
}
