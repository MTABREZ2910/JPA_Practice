package com.jpa.Practice.JPA_Practice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.Practice.JPA_Practice.entity.Products;
import com.jpa.Practice.JPA_Practice.service.ProductsService;

@RestController
public class ProductsController {
	@Autowired
	ProductsService ps;
	
	@GetMapping("/products")
	public List<Products> getDetails(){
		return ps.getDetails();
	}
	
	@GetMapping("/products/{id}")
	public Optional<Products> getDetailsById(@PathVariable int id){
		return ps.getDetailsById(id);
	}
	
	

}
