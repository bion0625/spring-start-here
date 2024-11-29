package comment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import comment.services.CommentService;

@Configuration
public class ProjectConfiguration {
	@Bean
	@Scope("prototype")
	CommentService commentService() {
		return new CommentService();
	}
}
