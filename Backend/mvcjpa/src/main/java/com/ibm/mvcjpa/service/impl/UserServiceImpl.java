package com.ibm.mvcjpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.mvcjpa.entity.User;
import com.ibm.mvcjpa.repo.UserRepo;
import com.ibm.mvcjpa.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired 
	UserRepo userrepo;
	
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userrepo.save(user);

	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userrepo.findAll();
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return userrepo.findById(id).get();
	}

}
