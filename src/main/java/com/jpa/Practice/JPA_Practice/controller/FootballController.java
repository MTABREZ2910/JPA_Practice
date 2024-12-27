package com.jpa.Practice.JPA_Practice.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/football/count")
	public long count() {
		return fs.count();
	}
	
	@DeleteMapping("/football/delete/{id}")
	public String delete(@PathVariable int id) throws SQLException {
		fs.delete(id);
		return "Row Deleted";
		 
	}
}
