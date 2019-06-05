package com.sood.vaibhav.jdbcdatabase.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sood.vaibhav.jdbcdatabase.entity.Person;

//@Repository
public class PersonJDBCDao{

	@PersistenceContext
	EntityManager entityManager;
//	@Autowired
//	JdbcTemplate jdbctemplate;
	
//	public List<Person>findAll(){
//		return entityManager.find(Person.class, 1);//query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
//	}
	public Person findById(int id){
	return entityManager.find(Person.class, 10001);
//		return jdbctemplate.queryForObject("select * from person where id = ?",new Object[] {id}, new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public Person insert(Person person) {
		return entityManager.merge(person);
	}
//	public int deleteById(int id){
//		return jdbctemplate.update("delete from person where id = ?",new Object[] {id});
//	}
}
