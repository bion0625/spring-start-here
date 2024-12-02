package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.model.TransferRequest;
import com.example.demo.service.TransferService;

@RestController
public class AccountController {

	private final TransferService transferService;
	
	public AccountController(TransferService transferService) {
		this.transferService = transferService;
	}
	
	// curl -X POST -d "{\"senderAccountId\":1,\"receiverAccountId\":2,\"amount\":10}" -H "Content-Type:application/json" http://localhost:8080/transfer
	@PostMapping("/transfer")
	public void transferMoney(@RequestBody TransferRequest request) {
		transferService.transferMoney(request.getSenderAccountId(), request.getReceiverAccountId(), request.getAmount());
	}
	
	// curl -X POST -d "{\"senderAccountId\":1,\"receiverAccountId\":2,}" 
	@GetMapping("/accounts")
	public List<Account> getAllAccounts() {
		return transferService.getAllAccounts();
	}
}
