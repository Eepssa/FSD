package com.ibm.person1.service;

import java.util.List;

import com.ibm.person1.entity.Person;

public interface PersonService {
	List<Person> findAll();
	Person findById(int id);
	void save(Person person);
	void deleteById(int id);
	
	List<Person> findByPersonName(String personName);
	
}
