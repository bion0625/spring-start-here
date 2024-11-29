package comment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import comment.aop.LoggingAspect;

@ComponentScan
@Configuration
@EnableAspectJAutoProxy
public class ProjectConfig {

	@Bean
	LoggingAspect aspect() {
		return new LoggingAspect();
	}
}
