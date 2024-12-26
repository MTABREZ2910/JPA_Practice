package com.jpa.Practice.JPA_Practice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.Practice.JPA_Practice.entity.Football;

public interface FootballRepo extends JpaRepository<Football,Integer> {

}
