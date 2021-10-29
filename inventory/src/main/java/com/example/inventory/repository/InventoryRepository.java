package com.example.inventory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.inventory.model.Product;

@Repository
public interface InventoryRepository extends CrudRepository<Product
, Long>{
      
}
