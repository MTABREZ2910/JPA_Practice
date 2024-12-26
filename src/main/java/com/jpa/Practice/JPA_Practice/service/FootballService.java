package com.jpa.Practice.JPA_Practice.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.jpa.Practice.JPA_Practice.db.FootballJPA;
import com.jpa.Practice.JPA_Practice.entity.Football;

public class FootballService {

	@Autowired
	FootballJPA fj;
	
	public Football saveDetails(Football football) {
		return fj.saveDetails(football);
	}
	
}
