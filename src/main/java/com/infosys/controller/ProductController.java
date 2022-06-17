package com.infosys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.dto.Product;

@RestController
@RequestMapping("/rest")
public class ProductController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Spring Rest";
	}
	
	@GetMapping("/Product")
	public Product getProduct() {
		Product p = new Product(1,"Lux",60,10);
		return p;
	}
}


