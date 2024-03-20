package com.ibm.category.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.category.service.CategoryService;
import java.util.List;
import com.ibm.category.entity.*;
@RestController
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/cat")
	List<Category> findAll()
	{
		return categoryService.findAll();
		
	}
	
	@GetMapping("/cat/{id}")
	Category findById(@PathVariable int id)
	{
		return categoryService.findById(id);
		
	}
	
	@PutMapping("/cat")
	void update(@RequestBody Category category)
	{
		 categoryService.save(category);
		
	}
	@PostMapping("/cat")
	void save(@RequestBody Category category)
	{
		 categoryService.save(category);
		
	}
	@DeleteMapping("/cat/{id}")
	void deleteById(@PathVariable int id)
	{
		  categoryService.deleteById(id);
		
	}
}
