package my.mood.Learn_Spring_Aop.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Before("execution(* my.mood.Learn_Spring_Aop.example.*.*.*(..))")
	public void CallAspectMethodBefore(JoinPoint joinPoint) {
		logger.info("Before - {} Aspect Method is called - {}"
				, joinPoint, joinPoint.getArgs());
	}
	
	@After("execution(* my.mood.Learn_Spring_Aop.example.*.*.*(..))")
	public void CallAspectMethodAfter(JoinPoint joinPoint) {
		logger.info("After - {} Aspect Method is called - {}"
				, joinPoint, joinPoint.getArgs());
	}
	
	@AfterReturning(
			pointcut = "execution(* my.mood.Learn_Spring_Aop.example.*.*.*(..))",
			returning = "returnValue"
			)
	public void CallAspectMethodAfterReturning(JoinPoint joinPoint, Object returnValue) {
		logger.info("After Returning - {} Aspect Method is called - {} successfully", joinPoint, returnValue);
	}
	
	@AfterThrowing(
			pointcut = "execution(* my.mood.Learn_Spring_Aop.example.*.*.*(..))",
			throwing = "exception"
			)
	public void CallAspectMethodAfterThrowing(JoinPoint joinPoint, Exception exception) {
		logger.info("After Throwing - {} Aspect Method is throwing - {} exception", joinPoint, exception);
	}
	
}
