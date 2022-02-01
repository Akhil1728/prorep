package com.example.Eureka.ProductService.ProductService;

import com.example.Eureka.ProductService.Entity.Products;
import com.example.Eureka.ProductService.ProductRepository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImp implements ProductService{

    @Autowired
    private final ProductRepository productRepository;

    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public Products getProductsById(long prodid){
        return productRepository.findById(prodid).get();
    }
    @Override
    public List<Products> getAllProducts(){
        return (List<Products>) productRepository.findAll();
    }
}
