package com.example.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.exceptions.ProductNameMustBeUniqueException;
import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;

@Service
public class ProductService {
 
   @Autowired
   private ProductRepository productRepository;
   	
    public Product save(Product product) {
    	  validateNameProduct(product);
    	  return productRepository.save(product);
    }
    
    private void validateNameProduct(Product product) {
          if (productRepository.findByName(product.getName()).isPresent())
          throw new ProductNameMustBeUniqueException();
    } 	
}
