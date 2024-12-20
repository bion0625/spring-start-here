package com.example.ex1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private String name = "Ella";	
	private final Parrot parrot;
	
	public Person(@Qualifier("parrot2")Parrot parrot) {
		this.parrot = parrot;
	}
	
	
	public String getName() {
		return name;
	}
	
	public Parrot getParrot() {
		return parrot;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
