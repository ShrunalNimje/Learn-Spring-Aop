package my.mood.Learn_Spring_Aop.example.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutAspect {

	@Pointcut("execution(* my.mood.Learn_Spring_Aop.example.*.*.*(..))")
	public void BusinessAndDataPackageConfig() {}
	
	@Pointcut("execution(* my.mood.Learn_Spring_Aop.example.business.*.*(..))")
	public void BusinessPackageConfig() {}
	
	@Pointcut("execution(* my.mood.Learn_Spring_Aop.example.data.*.*(..))")
	public void DataPackageConfig() {}
	
	@Pointcut("bean(*Service*)")
	public void AllPackageConfig() {}
	
	@Pointcut("@annotation(my.mood.Learn_Spring_Aop.example.annotation.TrackTime)")
	public void TrackTimeAnnotation() {}
	
}
