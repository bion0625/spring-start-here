package comment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import comment.services.CommentService;

@Configuration
//@ComponentScan
public class ProjectConfiguration {

	@Bean
	CommentService commentService() {
		return new CommentService();
	}
}
