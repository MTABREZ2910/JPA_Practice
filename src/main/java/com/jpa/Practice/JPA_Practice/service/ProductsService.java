package com.jpa.Practice.JPA_Practice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.Practice.JPA_Practice.db.ProductsJPA;
import com.jpa.Practice.JPA_Practice.entity.Products;

@Service
public class ProductsService {

	@Autowired
	ProductsJPA pj;
	
	public Optional<Products> getDetailsById(int id){
		return pj.getDetailsById(id);
	}
	
	public List<Products> getDetails(){
		return pj.getDetails();
	}
}
