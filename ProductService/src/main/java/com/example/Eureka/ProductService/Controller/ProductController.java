package com.example.Eureka.ProductService.Controller;


import com.example.Eureka.ProductService.Entity.Products;
import com.example.Eureka.ProductService.ProductService.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/{id}")
    public Products getProductById(@PathVariable("id") long prodid){
        return productService.getProductsById(prodid);
    }

    @GetMapping("/all")
    public List<Products> getAllProducts(){
        return productService.getAllProducts();
    }
}
