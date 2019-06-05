package com.sood.vaibhav.restfulWebservices.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sood.vaibhav.restfulWebservices.bean.User;

@Component
public class UserDaoService {

	private static int userCount = 4;
	
	private static List<User> users = new ArrayList<>();
	
	
	static {
		
		users.add(new User(1, "user1", new Date()));
		users.add(new User(2, "user2", new Date()));
		users.add(new User(3, "user3", new Date()));
		users.add(new User(4, "user4", new Date()));
		
	}
	
	public List<User> findAll(){
		return users;
	}
	public User save (User user) {
		users.add(new User(++userCount,user.getName(),user.getBirth_date()));
		user.setId(userCount);
		return user;
	}
	
	public User findById(Integer id){
		for(User usr:users){
			if (usr.getId().equals(id))
				return usr;
		}
		return null;
	}
	public User deleteById(Integer id){
		Iterator<User> iterator = users.iterator();
		while(iterator.hasNext()){
			User user = iterator.next();
			if(user.getId().equals(id))
				{iterator.remove();
			return user;}
		}
		return null;
	}
	
}
