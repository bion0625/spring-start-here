package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PaymentDetails;
import com.example.demo.service.PaymentService;

@RestController
public class PaymentController {
	
	private final PaymentService paymentService;
	
	public PaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	@PostMapping("/payment")
	public ResponseEntity<PaymentDetails> makePayment() {
		PaymentDetails paymentDetails = paymentService.processPayment();
		return ResponseEntity
				.status(HttpStatus.ACCEPTED)
				.body(paymentDetails);
	}

}
