package comment.aop;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import comment.model.Comment;

@Aspect
public class LoggingAspect {
	
	private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
	
	@Around("execution(* comment.service.*.*(..))")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		
		String methodName = joinPoint.getSignature().getName();
		Object [] arguments = joinPoint.getArgs();
		
		logger.info("Method " + methodName + " with parameters " + Arrays.toString(arguments) + " Method will execute");
		
		Comment comment = new Comment();
		comment.setText("Some other text!");
		Object[] newArgments = {comment};

		Object returenByMethod = joinPoint.proceed(newArgments);
		logger.info("Method executed and returned " + returenByMethod);
		
		return "FAILED";
	}
}
