package com.example.demo.service;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;

class TransferServiceTest {

	@Test
	@DisplayName("Test the amount is transfer from one account to another if no exception occurs.")
	void moneyTransferHappyFlow() {
		AccountRepository accountRepository = mock(AccountRepository.class);
		
		TransferService transferService = new TransferService(accountRepository);
		
		Account sender = new Account();
		sender.setId(1);
		sender.setAmount(new BigDecimal(1000));
		
		Account destication = new Account();
		destication.setId(2);
		destication.setAmount(new BigDecimal(1000));
		
		given(accountRepository.findById(sender.getId())).willReturn(Optional.of(sender));
		given(accountRepository.findById(destication.getId())).willReturn(Optional.of(destication));
		
		transferService.transferMoney(sender.getId(), destication.getId(), new BigDecimal(100));
		
		verify(accountRepository).changeAmount(1, new BigDecimal(900));
		verify(accountRepository).changeAmount(2, new BigDecimal(1100));
	}

}
