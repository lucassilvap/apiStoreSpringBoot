package com.example.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Product {
  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@Column
	private String name;
	
	@Column
	private Double price;
}
