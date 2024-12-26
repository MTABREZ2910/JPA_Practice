package com.jpa.Practice.JPA_Practice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.Practice.JPA_Practice.entity.School;

public interface SchoolRepo extends JpaRepository<School,Integer> {

}
