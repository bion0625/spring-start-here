package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import com.example.demo.model.LoginProcessor;

@ExtendWith(MockitoExtension.class)
class LoginControllerUnitTests {
	
	@Mock
	Model model;
	
	@Mock
	LoginProcessor loginProcessor;
	
	@InjectMocks
	LoginController loginController;

	@Test
	void loginPostLoginSucceedsTest() {
		given(loginProcessor.login()).willReturn(true);
		
		String result = loginController.loginSet("username", "password", model);
		
		assertEquals("login.html", result);
		
		verify(model).addAttribute("message", "You are now logged in");
	}
	
	@Test
	void loginPostLoginFailsTest() {
		given(loginProcessor.login()).willReturn(false);
		
		String result = loginController.loginSet("username", "password", model);
		
		assertEquals("login.html", result);
		verify(model).addAttribute("message", "Login failed");
	}

}
