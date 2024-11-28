package com.example.ex1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		var person = context.getBean(Person.class);
		
		System.out.println("Person's name: " + person.getName());
		System.out.println("Person's parrot: " + person.getParrot());
	}

}
