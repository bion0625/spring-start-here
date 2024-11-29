package comment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import comment.model.Comment;
import comment.proxy.EmailCommentNotificationProxy;
import comment.repositories.DBCommentRepository;
import comment.services.CommentService;

public class Main {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		
		var comment = new Comment();
		comment.setAuthor("Laurentiu");
		comment.setText("Demo comment");
		
		var commentService = context.getBean(CommentService.class);
		commentService.publishComment(comment);
	}
}
