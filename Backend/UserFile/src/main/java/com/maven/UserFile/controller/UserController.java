package com.maven.UserFile.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.maven.UserFile.entity.User;
import com.maven.UserFile.service.UserService;



@RestController
@CrossOrigin("*")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/user")
	List<User> findAll()
	{
		return userService.findAll();
		
	}
	
	@GetMapping("/user/{id}")
	User findById(@PathVariable int id)
	{
		return userService.findById(id);
		
	}
	
	@PutMapping("/user")
	void update(@RequestBody User user)
	{
		userService.save(user);
		
	}
	@PostMapping("/user")
	void save(@RequestBody User user)
	{
		userService.save(user);
		
	}
	@DeleteMapping("/user/{id}")
	void deleteById(@PathVariable int id)
	{
		userService.deleteById(id);
		
	}
}