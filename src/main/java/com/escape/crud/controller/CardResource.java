package com.escape.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escape.crud.model.Card;
import com.escape.crud.services.CardService;

@RestController
@RequestMapping("/cards")
public class CardResource {
	
	@Autowired
	private CardService service;
	
	@PostMapping
	public Card save(@RequestBody Card obj) {
		return service.save(obj);
	}
	
	@GetMapping
	public List<Card> findAll() {
		return service.findAll();
	}

	@GetMapping("/{id}")
	public Card findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		service.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public void update(@RequestBody Card obj) {
		service.save(obj);
	}
}
