package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Country;

@RestController
public class CountryController {
	
	@GetMapping("/france")
	public ResponseEntity<Country> france() {
		Country c = Country.of("France", 67);
		return ResponseEntity
				.status(HttpStatus.ACCEPTED)
				.header("continent", "Europe")
				.header("capital", "Paris")
				.header("favorite_food", "cheese ans wine")
				.body(c);
	}
}
