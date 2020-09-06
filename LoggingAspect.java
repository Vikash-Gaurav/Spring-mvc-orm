package com.stackroute.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/* Annotate this class with @Aspect and @Component */

@Aspect
@Component
public class LoggingAspect {

	private static final Logger LOG = LoggerFactory.getLogger(LoggingAspect.class);

	/*
	 * 
	 * Write loggers for each of the methods of controller, any particular method
	 * will have all the four aspectJ annotation
	 * (@Before, @After, @AfterReturning, @AfterThrowing).
	 * 
	 */

	@Before("execution(* com.stackroute.controller.*(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("Before Aspect");

		LOG.info("Before " + joinPoint.getSignature().getName() + " called");
	}
	
	@After("execution(* com.stackroute.controller.*(..))")
	public void after(JoinPoint joinPoint) {
		System.out.println("After Aspect");

		LOG.info("After " + joinPoint.getSignature().getName() + " called");

	}
	
	@AfterReturning(pointcut = "execution(* com.stackroute.controller.*(..))" , returning = "result")
	public void afterReturning(JoinPoint joinPoint , Object result) {
		System.out.println("AfterReturning Aspect");
		LOG.info("AfterReturning " + joinPoint.getSignature().getName() + " called");
		LOG.info(result.toString());

	}
	
	@AfterThrowing(pointcut = "execution(* com.stackroute.controller.*(..))", throwing = "error")
	public void afterThrowing(JoinPoint joinPoint , Throwable error) {
		System.out.println("AfterThrowing Aspect");

		LOG.info("AfterThrowing " + joinPoint.getSignature().getName() + " called");
		LOG.error(error.getMessage(), error);

	}
}