package com.sood.vaibhav.jdbcdatabase;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jdbc.JdbcRepositoriesAutoConfiguration;

import com.sood.vaibhav.jdbcdatabase.dao.PersonJDBCDao;
import com.sood.vaibhav.jdbcdatabase.entity.Person;
import com.sood.vaibhav.jdbcdatabase.jparepo.PersonJpaRepository;

@SpringBootApplication
public class JPAdatabaseApplication2 implements CommandLineRunner {
Logger logger = LoggerFactory.getLogger(JPAdatabaseApplication2.class);
	@Autowired
	PersonJpaRepository jdbcDao;
	
	
	public static void main(String[] args) {
		SpringApplication.run(JPAdatabaseApplication2.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//	//logger.info(jdbcDao.findAll().toString());
//	logger.info(jdbcDao.findById(10001).toString());
//	logger.info(jdbcDao.insert(new Person("test", "test", new java.sql.Date(10061990170000L))).toString());
//	//logger.info(jdbcDao.deleteById(10002) + "" );
//	jdbcDao.remove(10002);
//	logger.info(jdbcDao.findAllPerson().toString());
	}

}
