package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Purchase;
import com.example.demo.repository.PurchaseRepository;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

	private final PurchaseRepository purchaseRepository;
	
	public PurchaseController(PurchaseRepository purchaseRepository) {
		this.purchaseRepository = purchaseRepository;
	}
	
	// curl -X POST -d "{\"product\":\"Spring Security in Action\",\"price\":25.2}" -H "Content-Type:application/json" http://localhost:8080/purchase
	@PostMapping
	public void storePurchase(@RequestBody Purchase purchase) {
		purchaseRepository.storePurchase(purchase);
	}
	
	// curl http://localhost:8080/purchase
	@GetMapping
	public List<Purchase> findPurchase() {
		return purchaseRepository.findAllPurchases();
	}
}
