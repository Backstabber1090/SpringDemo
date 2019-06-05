package com.sood.vaibhav.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sood.vaibhav.demo.basic.BinarySearchImpl;
import com.sood.vaibhav.demo.scope.XmlDAO;


public class DemoXMLApplication {


	
	
	public static void main(String[] args) {
	//	BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSort());
		ApplicationContext context =
			    new ClassPathXmlApplicationContext("configuration.xml");
		//AnnotationConfigApplicationContext ctx=	new AnnotationConfigApplicationContext(DemoXMLApplication.class);
		System.out.println(context.getBeanDefinitionNames().toString());
		XmlDAO xmlDao= context.getBean(XmlDAO.class);
		System.out.println(xmlDao.getXmlConnection());
	
	}

}
