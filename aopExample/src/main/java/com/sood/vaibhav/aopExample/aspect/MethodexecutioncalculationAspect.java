package com.sood.vaibhav.aopExample.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.sood.vaibhav.aopExample.AopExampleApplication;

//AOP
//Configuration
@Aspect
@Configuration
public class MethodexecutioncalculationAspect {
	
	
	
	Logger logger  = LoggerFactory.getLogger(AopExampleApplication.class);
	
//what kind of method calls need to be intercepted
	@Before(value = "execution(* com.sood.vaibhav.aopExample..*.*(..))")
	public void beofre( JoinPoint joinPoint) {
		logger.info(joinPoint.getKind());
		logger.info("Intercepted Method calls {}",joinPoint);
	}
}
