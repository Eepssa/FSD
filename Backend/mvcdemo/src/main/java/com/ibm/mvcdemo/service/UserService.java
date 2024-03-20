package com.ibm.mvcdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.mvcdemo.entity.User;

 
public interface UserService {
	
	String makeUpper(String str);
	void save(User user);
	List<User> findAll();
	User findById(int id);
}
