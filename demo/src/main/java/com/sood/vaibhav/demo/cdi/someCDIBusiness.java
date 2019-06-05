package com.sood.vaibhav.demo.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class someCDIBusiness {

	@Inject
	someCDIDAO cdidao;

public someCDIDAO getCdidao() {
	return cdidao;
}

public void setCdidao(someCDIDAO cdidao) {
	this.cdidao = cdidao;
}
public int findgreatest() {
	
	int data[] = cdidao.getData();
	int returnValue = Integer.MIN_VALUE;
	for (int value:data) {
		if (value>returnValue) {
			returnValue= value;
		}
	}
	return returnValue;
}


}
