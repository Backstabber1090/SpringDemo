package com.sood.vaibhav.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
Logger logger = Logger.getLogger(LoginController.class);
	@RequestMapping(value="/login",method = RequestMethod.GET)
	//@ResponseBody
	public String hello() {
		logger.info("helloworld called ");
		return "login";
	}
	
	
}
