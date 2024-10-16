package com.fashionstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fashionstore.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	 Product findByNameProduct(String name);

}

