package com.example.product.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ProductNameMustBeUniqueException extends ResponseStatusException{

	public ProductNameMustBeUniqueException() {
		super(HttpStatus.BAD_GATEWAY, "product name must be unique!!");
		// TODO Auto-generated constructor stub
	}

}
