package com.sood.vaibhav.restfulWebservices.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloWorldController {

	@Autowired
	private MessageSource messageSource;
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String HelloWorld() {
		return messageSource.getMessage("good.morning.message",null, LocaleContextHolder.getLocale()) ;
	}
	@RequestMapping(value="/hello-international",method=RequestMethod.GET)
	public String HelloWorldinternational() {
		
		return "Hallo" ;
	}

	@RequestMapping(value="/hello-bean/{var}",method=RequestMethod.GET)
	public com.sood.vaibhav.restfulWebservices.bean.HelloWorld HelloWorldBean(@PathVariable(name="var") String var) {
		return new com.sood.vaibhav.restfulWebservices.bean.HelloWorld("id","test message"+var) ;
	}
}
