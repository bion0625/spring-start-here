package com.example.ex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	final private String name = "Ella";
	
	final private Parrot parrot;
	
	@Autowired
	public Person(Parrot parrot) {
		this.parrot = parrot;
	}
	
	public String getName() {
		return name;
	}
	
	public Parrot getParrot() {
		return parrot;
	}
}
