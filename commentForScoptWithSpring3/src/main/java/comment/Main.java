package comment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		var c = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
	}
}
