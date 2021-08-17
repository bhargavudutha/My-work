package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.model.Cart;
import com.service.ClientService;

@RestController
public class ConsumerController {
	@Autowired
	private ClientService clientService;

	@GetMapping(value = "search/{abc}")
	public ResponseEntity<Cart> getCart(@PathVariable("abc") Integer prodId) {
		Cart cart = clientService.search(prodId);
		return new ResponseEntity<Cart>(cart, HttpStatus.OK);
	}
}
