package comment.aop;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
	
	private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
	
	@AfterReturning(value = "@annotation(ToLog)", returning = "returnValue")
	public void log(Object returnValue) throws Throwable {
		
		logger.info("Method executed and returned " + returnValue);
		
	}
}
