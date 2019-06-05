package com.sood.vaibhav.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.sood.vaibhav.demo.cdi.someCDIBusiness;


@ComponentScan("com.sood.vaibhav")
public class DemoComponentScopeApplication {

	static
	 someCDIBusiness personDao;
	static Logger LOGGER = LoggerFactory.getLogger(DemoComponentScopeApplication.class);
	
	
	public static void main(String[] args) {
	//	BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSort());
		
		AnnotationConfigApplicationContext ctx=	new AnnotationConfigApplicationContext(DemoComponentScopeApplication.class);
		personDao = ctx.getBean(someCDIBusiness.class);
		LOGGER.info("{}",personDao.getCdidao());
		
	}

}
