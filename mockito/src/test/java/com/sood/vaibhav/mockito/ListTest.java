package com.sood.vaibhav.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class ListTest {

	@Test
	public void test() {
		List mockList = mock(List.class);
		when (mockList.size()).thenReturn(10).thenReturn(20);
		assertEquals(mockList.size(),10);
		assertEquals(mockList.size(),20);
	}
	
	@Test
	public void testgeneric() {
		List mockList = mock(List.class);
		when (mockList.get(Mockito.anyInt())).thenReturn("SomeString");
		assertEquals(mockList.get(1),"SomeString");
		assertEquals(mockList.get(1000),"SomeString");
	}
	

}
