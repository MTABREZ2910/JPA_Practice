package com.jpa.Practice.JPA_Practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.Practice.JPA_Practice.entity.Apple;
import com.jpa.Practice.JPA_Practice.service.AppleService;

@RestController
public class AppleController {

	@Autowired
	AppleService as;
	
	@PostMapping("/apple/body")
	public Apple insertValue(@RequestBody Apple apple) {
		return as.saveDetails(apple);
	}
}
