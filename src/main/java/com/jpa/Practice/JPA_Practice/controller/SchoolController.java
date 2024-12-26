package com.jpa.Practice.JPA_Practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.Practice.JPA_Practice.entity.School;
import com.jpa.Practice.JPA_Practice.service.SchoolService;

@RestController
public class SchoolController {
	
	@Autowired
	SchoolService ss;
	
	@GetMapping("/api/details")
	public List<School> getDetails(){
		return ss.getDetails();
	}
	
	@GetMapping("/api/count")
	public int getCount() {
		return ss.getCount();
	}
	

}
