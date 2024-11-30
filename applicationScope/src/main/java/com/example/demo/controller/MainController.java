package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.LoggedUserManagementService;
import com.example.demo.service.LoginCountService;

@Controller
public class MainController {
	private final LoggedUserManagementService loggedUserManagementService;
	private final LoginCountService countService;
	
	public MainController(LoggedUserManagementService loggedUserManagementService, LoginCountService countService) {
		this.loggedUserManagementService = loggedUserManagementService;
		this.countService = countService;
	}
	
	@GetMapping("/main")
	public String home(
			@RequestParam(required = false) String logout, 
			Model model
			) {
		if(logout != null) loggedUserManagementService.setUsername(null);
		
		String username = loggedUserManagementService.getUsername();
		int count = countService.getCount();
		
		if(username == null) return "redirect:/";
		
		model.addAttribute("username", username);
		model.addAttribute("loginCount", count);
		return "main.html";
	}
}
