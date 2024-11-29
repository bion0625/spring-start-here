package comment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import comment.aop.LoggingAspect;
import comment.aop.SecurityAspect;

@ComponentScan
@Configuration
@EnableAspectJAutoProxy
public class ProjectConfig {

	@Bean
	LoggingAspect loggingAspect() {
		return new LoggingAspect();
	}
	@Bean
	SecurityAspect securityAspect() {
		return new SecurityAspect();
	}
}
