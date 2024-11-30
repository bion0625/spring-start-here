package com.example.demo.model;

public class Country {
	
	private String name;
	private int papulation;
	
	public static Country of(String name, int papulation) {
		Country country = new Country();
		country.setName(name);
		country.setPapulation(papulation);
		return country;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPapulation() {
		return papulation;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPapulation(int papulation) {
		this.papulation = papulation;
	}
}
