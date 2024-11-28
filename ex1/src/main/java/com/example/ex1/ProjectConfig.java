package com.example.ex1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
	@Bean
	public Parrot parrot() {
		Parrot p = new Parrot();
		p.setName("Koko");
		return p;
	}
	
	@Bean
//	public Person person() {
	public Person person(Parrot parrot) {
		Person p = new Person();
		p.setName("Ella");
//		p.setParrot(parrot());
		p.setParrot(parrot);
		return p;
	}
}
