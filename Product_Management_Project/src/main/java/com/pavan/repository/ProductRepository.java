package com.pavan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavan.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	
}
