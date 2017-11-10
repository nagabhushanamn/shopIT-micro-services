package com.example.demo.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.demo.ProductCatalogApplication;
import com.example.demo.model.Product;

@SpringBootTest(classes = ProductCatalogApplication.class)
@RunWith(value = SpringJUnit4ClassRunner.class)
public class ProductRepositoryTest {

	// Unit Test ==> AAA ( Arrange , Act , Assert )

	@Autowired
	private ProductRepository productRepository;

	@Test
	public void loadProductsByPrice() {
		List<Product> products = productRepository.findByPrice(400.00);
		assertEquals(1, products.size());
	}

}
