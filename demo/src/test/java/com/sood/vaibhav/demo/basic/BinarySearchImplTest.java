package com.sood.vaibhav.demo.basic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.sood.vaibhav.demo.DemoApplication;
import com.sood.vaibhav.demo.cdi.someCDIBusiness;
import com.sood.vaibhav.demo.cdi.someCDIDAO;


@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(locations = "/configuration.xml")
public class BinarySearchImplTest {

//	@Autowired
//	BinarySearchImpl binarySearch;

	@InjectMocks
	someCDIBusiness someCDIBusiness;
	
	@Mock
someCDIDAO daoMock;
//	
//	@Test
//	public void test() {
//		binarySearch.binarySearch(new int[] {1,2 }, 2);
//		assertEquals(binarySearch.binarySearch(new int[] {1,2,3,4,5,6 }, 3),2);
//	}

	@Test
	public void testGreater() {
		
		Mockito.when(daoMock.getData()).thenReturn(new int[] {1,2,3,4});
		int actualResult = someCDIBusiness.findgreatest();
		assertEquals(actualResult,4);
	}
	
	
	
}
