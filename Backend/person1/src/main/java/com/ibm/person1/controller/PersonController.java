package com.ibm.person1.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.ibm.person1.entity.Person;
import com.ibm.person1.service.PersonService;


@RestController
public class PersonController {
	@Autowired
	PersonService personService;
	
	@GetMapping("/person")
	List<Person> findAll()
	{
		return personService.findAll();
		
	}
	@GetMapping("/personName/{personName}")
	List<Person> findByPersonName(@PathVariable String personName)
	{
		return personService.findByPersonName(personName);
		
	}
	
	@GetMapping("/person/{id}")
	Person findById(@PathVariable int id)
	{
		return personService.findById(id);
		
	}
	
	@PutMapping("/person")
	void update(@RequestBody Person person)
	{
		personService.save(person);
		
	}
	@PostMapping("/person") 
	void save(@Validated @RequestBody Person person)
	{
		personService.save(person);
		
	}
	@DeleteMapping("/person/{id}")
	void deleteById(@PathVariable int id)
	{
		personService.deleteById(id);
		
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(
	  MethodArgumentNotValidException ex) {
	    Map<String, String> errors = new HashMap<>();
	    ex.getBindingResult().getAllErrors().forEach((error) -> {
	        String fieldName = ((FieldError) error).getField();
	        String errorMessage = error.getDefaultMessage();
	        errors.put(fieldName, errorMessage);
	    });
	    return errors;
}}
