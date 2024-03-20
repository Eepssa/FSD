package com.maven.UserFile.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.UserFile.entity.User;
import com.maven.UserFile.repo.UserRepo;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepo userRepo;
	
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User findById(int id) {
		 
		return userRepo.findById(id).get();
	}

	@Override
	public void save(User user) {
		userRepo.save(user);
		
	}

	@Override
	public void deleteById(int id) {
		userRepo.deleteById(id);
		
	}

}