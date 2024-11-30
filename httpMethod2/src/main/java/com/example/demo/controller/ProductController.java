package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@Controller
public class ProductController {
	private final ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("/products")
	public String viewProducts(Model page) {
		var products = productService.findAll();
		page.addAttribute("products", products);
		return "products.html";
	}
	
	@PostMapping(path = "/products")
	public String addProduct(
			Product p,
			Model model) {
		productService.addProduct(p);
		
		var products = productService.findAll();
		model.addAttribute("products", products);		
		return "products.html";
	}
}
