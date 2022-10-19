package com.training.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.springboot.model.Employee;

public interface HomeRepository extends JpaRepository<Employee,Integer>{
	
}
