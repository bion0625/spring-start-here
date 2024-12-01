package com.example.demo.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Payment;
import com.example.demo.proxy.PaymentProxy;

import reactor.core.publisher.Mono;

@RestController
public class PaymentController {
	
	private final PaymentProxy paymentProxy;
	
	public PaymentController(PaymentProxy paymentProxy) {
		this.paymentProxy = paymentProxy;
	}
	
	@PostMapping("/payment")
	public Mono<Payment> createPayment(@RequestBody Payment payment) {
		String requestId = UUID.randomUUID().toString();
		return paymentProxy.createPayment(requestId, payment);
	}

}
