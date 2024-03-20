package com.ibm.mvcjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.ibm.mvcjpa.entity.User;
import com.ibm.mvcjpa.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userservice;
	
	@GetMapping("/home")
	String getHomePage(Model m) {
		return "Form";
	}
	
	@PostMapping("/save")
	String save(@ModelAttribute User user, Model m) {
		System.out.println(user);
		userservice.save(user);
		User user1=userservice.findById(1);
		m.addAttribute("user", user1);
		return "Data";
}
}