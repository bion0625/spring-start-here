package comment.aop;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
	
	private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
	
	@Around("@annotation(ToLog)")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		
		String methodName = joinPoint.getSignature().getName();
		Object [] arguments = joinPoint.getArgs();
		
		logger.info("Method " + methodName + " with parameters " + Arrays.toString(arguments) + " Method will execute");

		Object returenByMethod = joinPoint.proceed();
		logger.info("Method executed and returned " + returenByMethod);
		
		return "FAILED";
	}
}
