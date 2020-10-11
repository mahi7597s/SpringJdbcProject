package com.mahima.springmvc.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mahima.springmvc.model.User;

public class UserDao {
	
	@Autowired
	DataSource datasource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void saveUser(User user) {
		
		/*
		 * System.out.println(user.getGender()); String query=
		 * "insert into user values(%s,%s,?,%s,%s)"; jdbcTemplate.update(query, new
		 * Object[] {user.getUsername(), user.getGender(), user.getContact(),
		 * user.getEmail(), user.getPassword()});
		 */

		
		 String sql="insert into user(username) values('"+user.getUsername()+"')";        
		    jdbcTemplate.update(sql);  
		
	}

	
}
