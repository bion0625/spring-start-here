package com.example.ex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private String name = "Ellax";
	@Autowired
	private Parrot parrot;
	
	public String getName() {
		return name;
	}
	
	public Parrot getParrot() {
		return parrot;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setParrot(Parrot parrot) {
		this.parrot = parrot;
	}
}
