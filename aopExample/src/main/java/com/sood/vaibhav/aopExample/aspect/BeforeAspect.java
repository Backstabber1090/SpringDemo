package com.sood.vaibhav.aopExample.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
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
public class BeforeAspect {
	
	
	
	Logger logger  = LoggerFactory.getLogger(AopExampleApplication.class);
	
//what kind of method calls need to be intercepted
	@Around(value = "com.sood.vaibhav.aopExample.aspect.POintcutConfig.timetrack()")
	public void around( ProceedingJoinPoint joinPoint) throws Throwable {
		logger.info(joinPoint.getKind());
		long starttime = System.currentTimeMillis();
		joinPoint.proceed();
		long endtime = System.currentTimeMillis();
		logger.info(" {} time dddddddddtaken ",endtime-starttime);
	}

}
