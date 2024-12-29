package com.jpa.Practice.JPA_Practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@DeleteMapping("/apple/delete/{id}")
	public String delete(@PathVariable int id ) {
		as.delete(id);
		return "Row Deleted";
	}
	
	@DeleteMapping("apple/deleteall")
	public String delete() {
		as.delete();
		return "All values are deleted";
	}
	
	
	@GetMapping("/apple/count")
	public double count() {
		return as.count();
	}
}
