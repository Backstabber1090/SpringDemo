package com.sood.vaibhav.aopExample.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sood.vaibhav.aopExample.aspect.TrackTime;
import com.sood.vaibhav.aopExample.data.Data1;

@Service
public class Business1 {
@Autowired
	Data1 data1;
@TrackTime
public String calculateSomething() {
	return data1.retrieveSomething(); 
}
}
