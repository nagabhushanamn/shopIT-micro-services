package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.example.demo.config.Config;

@SpringBootApplication
@Import(value = { Config.class })
public class ProductCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCatalogApplication.class, args);
	}
}
