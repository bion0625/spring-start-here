package com.example.ex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
	
	private final String name = "Koko";
	private final Person person;
	
	@Autowired
	public Parrot(Person person) {
		this.person = person;
	}
	
	public String getName() {
		return name;
	}
	
	public Person getPerson() {
		return person;
	}
	
	@Override
	public String toString() {
		return "Parrot : " + this.name;
	}
}
