package com.example.ex1;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

public class Parrot {
	
	public Parrot() {
		System.out.println("parrot created");
	}
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Parrot : " + this.name;
	}
}
