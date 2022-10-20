package com.training.SprintBootTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.SprintBootTest.model.Product;

public interface ProdRepository extends JpaRepository<Product,Integer>{

}
