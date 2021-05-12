package com.example.POC2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.POC2.model.Product;

public interface ProductDao extends JpaRepository<Product,Integer> {

	
}
