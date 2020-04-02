package com.vardhan.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class AspectDetails {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	// syntax: execution(* package.*.*(..))

	// @Before method
	// @Before("execution(* com.vardhan.business.*.*(..))")
	// after appending pointcut expression
	@Before("pointcutForBusiness()")
	public void before(JoinPoint joinPoint) {
		logger.info("{}", "Aspect before executed!!!");
		logger.info("Joinpoint -> {}", joinPoint);
	}

	// @After method
	// @After("execution(* com.vardhan.business.*.*(..))")
	@After("pointcutForBusiness()")
	public void after(JoinPoint joinPoint) {
		logger.info("{}", "Aspect after executed!!!");
		logger.info("Joinpoint -> {}", joinPoint);
	}

	// @AfterReturning
	// @AfterReturning(value = "execution(* com.vardhan.business.*.*(..))",
	// returning = "result")
	// After appending pointcut expression
	@AfterReturning(value = "pointcutForBusiness()", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		logger.info("Joinpoint -> {}", joinPoint);
		logger.info("returned value with {}", result);
	}

	
	//@Around usage
	@Around("execution(* com.vardhan.business.*.*(..))")
	public void aroundService(ProceedingJoinPoint pjointpoint) throws Throwable {
		
		long startTime = System.currentTimeMillis();
		
		pjointpoint.proceed();
		
		long tometaken = startTime - System.currentTimeMillis();
		logger.info("Time taken ----->>>> {}",tometaken);
	}
	
	@Before("@annotation(com.vardhan.aop.demoAnnotation)")
	public void AnnotationDemo(JoinPoint joinpoint) {
		
		logger.info("Annotation demo ----> {}",joinpoint);
	}
	
	// Pointcut expression
	// @Pointcut
	@Pointcut("execution(* com.vardhan.business.*.*(..))")
	public void pointcutForBusiness() {
	};

}
