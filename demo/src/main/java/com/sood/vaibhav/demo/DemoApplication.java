package com.sood.vaibhav.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sood.vaibhav.demo.basic.BinarySearchImpl;


public class DemoApplication {

	
	
	
	public static void main(String[] args) {
	//	BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSort());
		
		AnnotationConfigApplicationContext ctx=		new AnnotationConfigApplicationContext(DemoApplication.class);
		BinarySearchImpl binarySearchImpl = ctx.getBean(BinarySearchImpl.class);
		System.out.println(binarySearchImpl.binarySearch(new int[] {1,2,3},3));
	
	}

}
