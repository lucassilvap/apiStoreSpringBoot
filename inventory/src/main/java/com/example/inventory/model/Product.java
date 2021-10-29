package com.example.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private Double price;
	
}
