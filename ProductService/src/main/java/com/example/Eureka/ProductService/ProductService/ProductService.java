package com.example.Eureka.ProductService.ProductService;

import com.example.Eureka.ProductService.Entity.Products;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {

    Products  getProductsById(long prodid);
    List<Products> getAllProducts();

}
