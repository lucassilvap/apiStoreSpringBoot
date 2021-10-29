package com.example.inventory.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.inventory.exception.ProductNotFoundException;
import com.example.inventory.model.Product;
import com.example.inventory.repository.InventoryRepository;

@Service
public class InventoryService {

	 @Autowired
	 private InventoryRepository inventoryRepository;
	
     public Product findById(Long id) {
    	 Optional<Product> product = inventoryRepository.findById(id);
    	 if(!product.isPresent())
    	 throw new ProductNotFoundException(id);
    	 return product.get();
    }
}
