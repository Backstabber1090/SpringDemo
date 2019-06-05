package com.sood.vaibhav.mockito;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessImplTest {

	@Test
	public void testfindTheGreaatestFromAllData() {
		SomeBusinessImpl impl = new SomeBusinessImpl(new DataServiceStub());
		assertEquals(impl.findTheGreaatestFromAllData(),123123123);
	}

}
class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3,4,5,6,2,2323,2323,123,123,123123123};
	}
	
	
}