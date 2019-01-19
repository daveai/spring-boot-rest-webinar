package com.example.invoicedemo.repositories;

import com.example.invoicedemo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
