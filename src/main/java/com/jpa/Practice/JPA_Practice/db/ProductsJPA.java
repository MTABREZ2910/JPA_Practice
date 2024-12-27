package com.jpa.Practice.JPA_Practice.db;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.Practice.JPA_Practice.entity.Products;
import com.jpa.Practice.JPA_Practice.repo.ProductsRepo;

@Component
public class ProductsJPA {
	
	@Autowired
	ProductsRepo pr;
	
	public Optional<Products> getDetailsById(int id){
		return pr.findById(id);
	}
	
	public List<Products> getDetails(){
		return pr.findAll();
	}

}
