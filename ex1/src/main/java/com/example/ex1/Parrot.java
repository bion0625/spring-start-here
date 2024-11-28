package com.example.ex1;

public class Parrot {
	
	private String name;
	
	Parrot() {
		System.out.println("Parrot created");
	}
		
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
