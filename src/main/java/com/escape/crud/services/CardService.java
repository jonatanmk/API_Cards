package com.escape.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escape.crud.model.Card;
import com.escape.crud.repositories.CardRepository;

@Service
public class CardService {
	
	@Autowired
	private CardRepository repository;
	
	public Card save(Card obj) {
		return repository.save(obj);
	}
	
	public List<Card> findAll() {
		return repository.findAll();
	}

	public Card findById(Long id) {
		return repository.findById(id).get();
	}
	
	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	
	public void update(Card obj) {
		repository.save(obj);
	}
}
