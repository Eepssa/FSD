package com.ibm.mvcdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.mvcdemo.entity.User;
import com.ibm.mvcdemo.repo.UserRepo;
import com.ibm.mvcdemo.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public String makeUpper(String str) {
		// TODO Auto-generated method stub
		return str.toUpperCase();
	}

	@Override
	public void save(User user) {
		userRepo.save(user);
		
	}

	@Override
	public List<User> findAll() {
		 
		return userRepo.findAll();
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id).get();
	}

}
