package com.maven.mongo.MongoUser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.maven.mongo.MongoUser.entity.User;
import com.maven.mongo.MongoUser.repo.UserRepo;

@RestController
public class UserController {
 
	@Autowired
	UserRepo userRepo;
	
	@PostMapping("/usermn")
	void save(@RequestBody User user)
	{
		userRepo.save(user);
	}
	
	@GetMapping("/usermn")
	List<User> getAllUsers()
	{
		
		return userRepo.findAll();
	}
	
	
}
