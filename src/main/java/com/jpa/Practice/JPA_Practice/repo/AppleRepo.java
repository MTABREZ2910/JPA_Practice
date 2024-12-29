package com.jpa.Practice.JPA_Practice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.Practice.JPA_Practice.entity.Apple;

public interface AppleRepo extends JpaRepository<Apple,Integer> {

}
