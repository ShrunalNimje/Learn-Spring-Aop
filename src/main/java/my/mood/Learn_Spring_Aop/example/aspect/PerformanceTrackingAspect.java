package my.mood.Learn_Spring_Aop.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class PerformanceTrackingAspect {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	// @Around("execution(* my.mood.Learn_Spring_Aop.example.*.*.*(..))")
	@Around("my.mood.Learn_Spring_Aop.example.aspect.CommonPointcutAspect.TrackTimeAnnotation()")
	public Object FindExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		
		long startTime = System.currentTimeMillis();
		
		Object proceed = proceedingJoinPoint.proceed();
		
		long stopTime = System.currentTimeMillis();
		
		long executionTime = stopTime - startTime;
		
		logger.info("Around Aspect {} - method executed in {} ms", proceedingJoinPoint, executionTime);
		
		return proceed;
		
	}
}
