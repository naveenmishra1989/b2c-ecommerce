package com.ecommerce;

import com.ecommerce.entity.Product;
import com.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class B2cEcommerceApplication {

	@Autowired
	private ProductRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(B2cEcommerceApplication.class, args);
	}

	@PostConstruct
	void init(){
		Product product = Product.builder().build();
		//productRepository.save()
	}
}
