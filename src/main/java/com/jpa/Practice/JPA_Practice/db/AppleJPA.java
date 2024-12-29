package com.jpa.Practice.JPA_Practice.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.Practice.JPA_Practice.entity.Apple;
import com.jpa.Practice.JPA_Practice.repo.AppleRepo;

@Component
public class AppleJPA {
	
	@Autowired
	AppleRepo ar;
	
	public Apple saveDetails(Apple apple) {
		return ar.save(apple);
	}

	public void delete(int id) {
		ar.deleteById(id);
	}
	
	public void delete() {
		ar.deleteAll();
	}
	
	public long count() {
		return ar.count();
	}
}
