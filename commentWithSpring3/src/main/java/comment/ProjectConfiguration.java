package comment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import comment.proxy.CommentNotificationProxy;
import comment.proxy.EmailCommentNotificationProxy;
import comment.repositories.CommentRepository;
import comment.repositories.DBCommentRepository;
import comment.services.CommentService;

@Configuration
@ComponentScan
public class ProjectConfiguration {
	@Bean
	CommentRepository commentRepository() {
		return new DBCommentRepository();
	}
	@Bean
	CommentNotificationProxy commentNotificationProxy() {
		return new EmailCommentNotificationProxy();
	}
	@Bean
	CommentService commentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
		return new CommentService(commentRepository, commentNotificationProxy);
	}
}
