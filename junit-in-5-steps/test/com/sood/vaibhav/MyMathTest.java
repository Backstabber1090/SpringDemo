package com.sood.vaibhav;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyMathTest {
myMath myMath;
	@Before
	public void initialize() {
		myMath = new myMath();
		System.out.println("Before");
	}
	
	@Test
	public void test() {
		assertEquals(myMath.sum(new int[] {1,2,3,4,1,1}), 12);
		
	}
	
	@Test
	public void testwithOneNumber() {
		assertEquals(myMath.sum(new int[] {10}), 10);
		
	}
	@After
	public void aftertheTestsPassed() {
		System.out.println("After");
	}

}
