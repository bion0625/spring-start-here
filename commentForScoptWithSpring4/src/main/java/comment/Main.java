package comment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import comment.services.CommentService;

public class Main {
	public static void main(String[] args) {
		var c = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		
		System.out.println("Before retrieving the CommnetService");
		var service = c.getBean(CommentService.class);
		System.out.println("After retrieving the CommnetService");
	}
}
