package com.sood.vaibhav.jdbcdatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sood.vaibhav.jdbcdatabase.dao.PersonJDBCDao;

//@SpringBootApplication
public class JdbcdatabaseApplication  {
Logger logger = LoggerFactory.getLogger(JdbcdatabaseApplication.class);
	@Autowired
	PersonJDBCDao jdbcDao;
	
	
	public static void main(String[] args) {
		SpringApplication.run(JdbcdatabaseApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//	logger.info(jdbcDao.findAll().toString());
//	logger.info(jdbcDao.findById(10001).toString());
//	
//	logger.info(jdbcDao.deleteById(10002) + "" );
//	}

}
