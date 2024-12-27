package com.jpa.Practice.JPA_Practice.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.Practice.JPA_Practice.db.FootballJPA;
import com.jpa.Practice.JPA_Practice.entity.Football;
import com.jpa.Practice.JPA_Practice.repo.FootballRepo;

@Service
public class FootballService {

	@Autowired
	FootballJPA fj;
	
	@Autowired
	FootballRepo fr;
	
	public Football saveDetails(Football football) {
		return fj.saveDetails(football);
	}
	
	public long count() {
		return fj.count();
	}
	
	public void delete(int id) throws SQLException{
		fj.delete(id);
	}
	
}
