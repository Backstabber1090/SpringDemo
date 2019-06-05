package com.sood.vaibhav.restfulWebservices.bean;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description="All details about User")
public class User {

	private Integer id;
	@Size(min=2, message="Name should have at least 2 characters")
	private String name;
	@Past
	@ApiModelProperty(notes="birth date cannot be in future")
	private Date birth_date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User() {
		
	}
	public User(Integer id, String name, Date birth_date) {
		super();
		this.id = id;
		this.name = name;
		this.birth_date = birth_date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	} 
	
	
}
