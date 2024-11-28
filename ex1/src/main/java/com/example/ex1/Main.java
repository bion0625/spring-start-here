package com.example.ex1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Parrot x = new Parrot();
		x.setName("Kiki");
		context.registerBean("parrot1", Parrot.class, () -> x);
		
		var p = context.getBean(Parrot.class);
		
//		var p = context.getBean("parrot2", Parrot.class);
//		var p = context.getBean("miki", Parrot.class);
//		var p = context.getBean(Parrot.class);
//		System.out.println(p);
		System.out.println(p.getName());
//		String s = context.getBean(String.class);
//		System.out.println(s);
//		Integer n = context.getBean(Integer.class);
//		System.out.println(n);
	}

}
