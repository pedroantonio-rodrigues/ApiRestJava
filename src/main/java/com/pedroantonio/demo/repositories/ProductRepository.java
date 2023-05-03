package com.pedroantonio.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedroantonio.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
