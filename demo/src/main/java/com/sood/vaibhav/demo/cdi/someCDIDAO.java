package com.sood.vaibhav.demo.cdi;

import javax.inject.Named;

@Named
public class someCDIDAO {

	public someCDIDAO() {
		System.out.println("tsetste");
	}
public int [] getData() {
	
	return new int[] {1,2,3,4,5,6,7};
	
}
}
