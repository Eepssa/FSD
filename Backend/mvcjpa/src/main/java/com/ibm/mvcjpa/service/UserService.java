package com.ibm.mvcjpa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.mvcjpa.entity.User;

public interface UserService {
	
	void save(User user);
	List<User> findAll();
	User findById(int id);
}
