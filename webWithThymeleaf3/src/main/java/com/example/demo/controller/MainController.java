package com.example.demo.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping("/home")
	public String home(
			@RequestParam(required = false) String color,
			@RequestParam(required = false) String name,
			Model page) {
		page.addAttribute("username", Optional.ofNullable(name).orElse("Katy"));
		page.addAttribute("color", Optional.ofNullable(color).orElse("red"));
		return "home.html";
	}
}
