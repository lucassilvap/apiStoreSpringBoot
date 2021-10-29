package com.example.inventory.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ProductNotFoundException extends ResponseStatusException{

	public ProductNotFoundException(Long id) {
		super(HttpStatus.FOUND, "product with id: "+id + " not found !!");
		// TODO Auto-generated constructor stub
	}

}
