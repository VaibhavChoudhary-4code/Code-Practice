package com.example.hibernatesession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired 
	private ProductService productService;
	
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Long id){
		System.out.println("Hello");
		Product product = productService.getProductById(id);
		return ResponseEntity.ok(product);
	}
}
