package com.example.BeverageRest.Controller;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.BeverageRest.movEntity.*;
import com.example.BeverageRest.service.BeverageService;

import  org.slf4j.*;
@RestController
public class BeverageController {
	@Autowired
	BeverageService beverageService;
	
	Log logger= LogFactory.getLog(BeverageController.class) ;
	
	@GetMapping("/beverage")
	List<Beverage> findAll()
	{
		logger.info("--findAll--");
		return beverageService.findAll();
		
		
	}
	@GetMapping("/beverage/{id}")
	Beverage  findById(@PathVariable int id)
	{
	logger.info("--findById--");
		return beverageService.findById(id);
		
		
	}
	
	@PostMapping("/beverage")
	void  create(@RequestBody Beverage m)
	{
		logger.info("--create--"); 
		beverageService.save(m);
		
	}
	
	@PutMapping("/beverage")
	void  update(@RequestBody Beverage m)
	{
	 logger.info("--update--"); 
		beverageService.save(m);
		
	}
	
	
	@DeleteMapping("/beverage/{id}")
	void   deleteById(@PathVariable int id)
	{
		
		logger.info("--deleteById--"); 
		beverageService.deleteById(id);
		
		
	}

}