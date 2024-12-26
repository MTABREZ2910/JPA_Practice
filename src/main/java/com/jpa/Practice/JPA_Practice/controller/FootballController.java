package com.jpa.Practice.JPA_Practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.Practice.JPA_Practice.entity.Football;
import com.jpa.Practice.JPA_Practice.service.FootballService;

@RestController
public class FootballController {
	@Autowired
	FootballService fs;

	@PostMapping("/football")
	public Football insertValues(@RequestBody Football football) {
		return fs.saveDetails(football);
	}
}
