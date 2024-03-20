package com.ibm.person1.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.person1.entity.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {
	public List<Person> findByPersonName(String personName);   //from personName the method
}
