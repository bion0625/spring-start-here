package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Payment;
import com.example.demo.proxy.PaymentProxy;

@RestController
public class PaymentController {
	
	private final PaymentProxy paymentProxy;
	
	public PaymentController(PaymentProxy paymentProxy) {
		this.paymentProxy = paymentProxy;
	}
	
	@PostMapping("/payment")
	public Payment createPayment(
			@RequestBody Payment payment) {
		
		return paymentProxy.createPayment(payment);
	}

}
