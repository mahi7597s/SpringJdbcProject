package com.mahima.springmvc.managers;

import org.springframework.beans.factory.annotation.Autowired;

import com.mahima.springmvc.dao.UserDao;
import com.mahima.springmvc.model.User;

public class UserManager {

	private UserManager() {}
	
	private static UserManager userManager= new UserManager();
	
	public static UserManager getUserManager() {
		return userManager;
	}
	
	@Autowired
	public UserDao dao;
	
	public User createUser(long id, String username, String gender, long contact, String email, String password)
	{
		User user= new User();
		user.setId(id);
		user.setUsername(username);
		user.setGender(gender);
		user.setContact(contact);
		user.setEmail(email);
		user.setPassword(password);
		
		return user;
		
	}

	public void saveUser(User user) {
		System.out.println(user.getEmail());
		dao.saveUser(user);
	}
	
}
