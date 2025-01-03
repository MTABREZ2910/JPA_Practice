package com.jpa.Practice.JPA_Practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.Practice.JPA_Practice.db.AppleJPA;
import com.jpa.Practice.JPA_Practice.entity.Apple;

@Service
public class AppleService {
	
	@Autowired
	AppleJPA as;
	
	public Apple saveDetails(Apple apple) {
		return as.saveDetails(apple);
	}

}
