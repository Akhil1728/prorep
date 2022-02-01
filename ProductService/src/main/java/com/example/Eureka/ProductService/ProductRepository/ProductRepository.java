package com.example.Eureka.ProductService.ProductRepository;

import com.example.Eureka.ProductService.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products,Long> {
}
