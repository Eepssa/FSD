package com.ibm.person1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.ibm.person1.entity.Person;
import com.ibm.person1.repo.PersonRepo;
import com.ibm.person1.vo.Pan;
@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	PersonRepo personRepo;
	
	@Override
	public List<Person> findAll() {
		
		List<Person> personList=personRepo.findAll();
 
		String baseUrl="http://localhost:9002/pan/";
		for(Person p:personList)
		{
			String url=baseUrl+p.getPanId();
			RestClient restClient=  RestClient.create(url);
			Pan pan = restClient.get() 
					  .uri(url) 
					  .retrieve() 
					  .body(Pan.class); 
			
			p.setPanNumber(pan.getPan());
			//prodListOp.add(p);
			
		}
	 
		return personList;
	}

	@Override
	public Person findById(int id) {
		 
		Person p= personRepo.findById(id).get();
		
		String url="http://localhost:9002/pan/"+id;
 		RestClient restClient=  RestClient.create(url);
 
		Pan pan = restClient.get() 
				  .uri(url) 
				  .retrieve() 
				  .body(Pan.class); 
		p.setPanNumber(pan.getPan());
		
		return p;
	}

	@Override
	public void save(Person person) {
		 
		personRepo.save(person);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Person> findByPersonName(String personName) {
		List<Person> personList=personRepo.findAll();
		 
		String baseUrl="http://localhost:9002/pan/";
		for(Person p:personList)
		{
			String url=baseUrl+p.getPanId();
			RestClient restClient=  RestClient.create(url);
			Pan pan = restClient.get() 
					  .uri(url) 
					  .retrieve() 
					  .body(Pan.class); 
			
			p.setPanNumber(pan.getPan());
		}
		return personRepo.findByPersonName(personName);
	}
	

}
