package comment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import comment.services.CommentService;
import comment.services.UserService;

public class Main {
	public static void main(String[] args) {
		var c = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		
		var s1 = c.getBean(CommentService.class);
		var s2 = c.getBean(UserService.class);
		
		boolean b = s1.getCommentRepository() == s2.getCommentRepository();
		
		System.out.println(b);
	}
}
