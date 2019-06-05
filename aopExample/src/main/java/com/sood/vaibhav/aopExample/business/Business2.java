package com.sood.vaibhav.aopExample.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sood.vaibhav.aopExample.aspect.TrackTime;
import com.sood.vaibhav.aopExample.data.Data2;

@Service
public class Business2 {
	@Autowired
	Data2 data2;
	@TrackTime
public String calculateSomething() {
	return data2.retrieveSomething(); 
}
}
