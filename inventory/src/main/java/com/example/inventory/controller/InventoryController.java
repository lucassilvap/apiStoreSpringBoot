package com.example.inventory.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.inventory.service.InventoryService;

@Controller
public class InventoryController {

	@Autowired
	private InventoryService inventoryService; 
	
	@GetMapping("{id}")
	public ResponseEntity<?> findProductById(@PathVariable(value = "id",required = false) Long id){
		return ResponseEntity.ok(inventoryService.findById(id));
	}
}
