package com.maven.UserFile.service;

import java.util.List;

import com.maven.UserFile.entity.User;


public interface UserService {
    List<User> findAll();
    User findById(int id);
	void save(User user);
	void deleteById(int id);
}
