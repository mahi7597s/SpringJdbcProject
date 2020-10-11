package com.mahima.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mahima.springmvc.managers.UserManager;
import com.mahima.springmvc.model.User;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String register(Model theModel) {
		
		// create a new User object
		User user= new User();
				
		//add student object to the model
		theModel.addAttribute("user", user);
		
		return "register";
	}
	
	@RequestMapping("/processRegistration")
	public String processRegistration(@ModelAttribute("user") User user) {
		
		UserManager.getUserManager().saveUser(user);
		
		return "registrationConfirm";
	}
}
