package com.example.Eureka.ProductService;

import com.example.Eureka.ProductService.Entity.Products;
import com.example.Eureka.ProductService.ProductRepository.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@EnableDiscoveryClient
@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {

	ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(ProductServiceApplication.class, args);
		ProductRepository productRepository = configurableApplicationContext.getBean(ProductRepository.class,args);
		productRepository.save(new Products(11L,"Mint Leaves","For Consuming"));
		productRepository.save(new Products(12L,"Fruit Basket","For Carrying"));
	}

}
