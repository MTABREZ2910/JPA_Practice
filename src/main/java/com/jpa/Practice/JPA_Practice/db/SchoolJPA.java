package com.jpa.Practice.JPA_Practice.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.Practice.JPA_Practice.entity.School;
import com.jpa.Practice.JPA_Practice.repo.SchoolRepo;

@Component
public class SchoolJPA {
	
	@Autowired
	SchoolRepo rp;
	
	public List<School> getDetails(){
		return rp.findAll();
	}
	
	public int method1(){
		return (int) rp.count();
	}

	
}
