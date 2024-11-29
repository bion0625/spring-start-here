package comment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import comment.services.CommentService;

public class Main {
	public static void main(String[] args) {
		var c = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		
		var s1 = c.getBean("commentService", CommentService.class);
		var s2 = c.getBean("commentService", CommentService.class);
		
		boolean b = s1 == s2;
		System.out.println(b);
	}
}
