package com.example.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.product.model.Product;
import com.example.product.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping
	public ResponseEntity<?> saveProduct(@RequestBody Product product){
		return ResponseEntity.ok(productService.save(product));
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> findProduct(@PathVariable(name = "id") Long id){
     RestTemplate template = new RestTemplate();
		 
		 UriComponents uri = 
		 UriComponentsBuilder.newInstance()
		 .scheme("http")
		 .host("localhost:8081/")
		 .path(id.toString())
		 .build();
		 
		 ResponseEntity<?> entity = 
		 template.getForEntity(uri.toString(), Product.class);
		 return entity;
	}
}
