package com.jpa.Practice.JPA_Practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.Practice.JPA_Practice.db.SchoolJPA;
import com.jpa.Practice.JPA_Practice.entity.School;

@Service
public class SchoolService {
	@Autowired
	SchoolJPA sj;
	
	public List<School> getDetails(){
		return sj.getDetails();
	}
	
	public int getCount() {
		return sj.method1();
	}
	
	
}
