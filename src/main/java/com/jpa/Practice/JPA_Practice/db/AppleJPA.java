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

}
