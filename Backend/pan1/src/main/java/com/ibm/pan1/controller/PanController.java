package com.ibm.pan1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.pan1.entity.Pan;
import com.ibm.pan1.service.PanService;

@RestController
public class PanController {
	@Autowired
	PanService panService;
	
	@GetMapping("/pan")
	List<Pan> findAll()
	{
		return panService.findAll();
		
	}
	
	@GetMapping("/pan/{id}")
	Pan findById(@PathVariable int id)
	{
		return panService.findById(id);
		
	}
	
	@PutMapping("/pan")
	void update(@RequestBody Pan pan)
	{
		 panService.save(pan);
		
	}
	@PostMapping("/pan")
	void save(@RequestBody Pan pan)
	{
		 panService.save(pan);
		
	}
	@DeleteMapping("/pan/{id}")
	void deleteById(@PathVariable int id)
	{
		  panService.deleteById(id);
		
	}
}