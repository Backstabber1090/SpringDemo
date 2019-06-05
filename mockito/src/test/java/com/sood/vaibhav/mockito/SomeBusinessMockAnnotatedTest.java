package com.sood.vaibhav.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotatedTest {

	@Mock
	DataService dataServiceMock;
	@InjectMocks
	SomeBusinessImpl impl;

	@Test
	public void testfindTheGreaatestFromAllData() {
		// DataService dataServiceMock = mock (DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 1, 2, 3 });
		// SomeBusinessImpl impl = new SomeBusinessImpl(dataServiceMock);
		assertEquals(impl.findTheGreaatestFromAllData(), 3);
	}

}
