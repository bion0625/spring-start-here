package com.example.demo.service;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.exception.AccountNotFoundException;
import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class TransferServiceWithAnnotationUnitTests {
	
	@Mock
	private AccountRepository accountRepository;
	
	@InjectMocks
	private TransferService transferService;

	@Test
	void moneyTransferHappyFlow() {
		Account sender = new Account();
		sender.setId(1);
		sender.setAmount(new BigDecimal(1000));
		
		Account destication = new Account();
		destication.setId(2);
		destication.setAmount(new BigDecimal(1000));
		
		given(accountRepository.findById(sender.getId())).willReturn(Optional.of(sender));
		given(accountRepository.findById(destication.getId())).willReturn(Optional.of(destication));
		
		transferService.transferMoney(1, 2, new BigDecimal(100));
		
		verify(accountRepository).changeAmount(1, new BigDecimal(900));
		verify(accountRepository).changeAmount(2, new BigDecimal(1100));
	}
	
	@Test
	void moneyTransferDesticationAccountNotFoundFlow() {
		Account sender = new Account();
		sender.setAmount(new BigDecimal(1000));
		sender.setId(1);
		given(accountRepository.findById(1L)).willReturn(Optional.of(sender));
		
		given(accountRepository.findById(2L)).willReturn(Optional.empty());
		
		assertThrows(AccountNotFoundException.class, () -> transferService.transferMoney(1, 2, new BigDecimal(100)));
		
		verify(accountRepository, never()).changeAmount(anyLong(), any());
	}

}
