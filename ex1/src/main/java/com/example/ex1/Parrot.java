package com.example.ex1;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

//@Component
public class Parrot {
	
	private String name;
	
//	@PostConstruct
//	public void init() {
//		this.name = "Koko";
//	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
