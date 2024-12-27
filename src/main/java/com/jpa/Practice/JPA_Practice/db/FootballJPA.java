package com.jpa.Practice.JPA_Practice.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.Practice.JPA_Practice.entity.Football;
import com.jpa.Practice.JPA_Practice.repo.FootballRepo;

@Component
public class FootballJPA {
	@Autowired
	FootballRepo fr;
	
	public Football saveDetails(Football football) {
		return fr.save(football);
	}
	
	public long count() {
		return fr.count();
	}
	
	public void delete(int id) {
		fr.deleteById(id);
	}
	
	

	
	
	 


}
