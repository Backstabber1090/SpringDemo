package com.sood.vaibhav.restfulWebservices.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sood.vaibhav.restfulWebservices.bean.User;
import com.sood.vaibhav.restfulWebservices.repository.UserDaoService;

@RestController
public class UsersController {

	@Autowired
	UserDaoService dao;
	@GetMapping(value="/users")
	public List<User> retrieveAllUsers(){
		return dao.findAll();
	}
	
	@GetMapping(value="/users/{id}")
	public Resource<User> retrieveUserById(@PathVariable Integer id){
		User user =dao.findById(id);
		if (user==null)
		throw new UserNotFoundException("User Not Found");
		
		
		//HATEOAS
		Resource<User> resource = new Resource<User>(user);
		ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAllUsers());
		resource.add(linkTo.withRel("all-users"));
		
		
		
		return resource;
	}
	
	@DeleteMapping(value="/users/{id}")
	public void deleteUserById(@PathVariable Integer id){
		User user =dao.deleteById(id);
		if (user==null)
		{
			
			throw new UserNotFoundException("User Not Found");
		}
		
		//return null;
	}
	
	
	@PostMapping(value="/users")
	public ResponseEntity<Object> addUser(@Valid @RequestBody User user) {
		
		User savedUser =  dao.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
}
