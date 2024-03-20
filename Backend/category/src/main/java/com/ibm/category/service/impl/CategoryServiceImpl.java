package com.ibm.category.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.category.entity.Category;
import com.ibm.category.repo.CategoryRepo;
import com.ibm.category.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepo categoryRepo;
	
	
	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return categoryRepo.findAll();
	}

	@Override
	public Category findById(int id) {
		 
		return categoryRepo.findById(id).get();
	}

	@Override
	public void save(Category category) {
		categoryRepo.save(category);
		
	}

	@Override
	public void deleteById(int id) {
		categoryRepo.deleteById(id);
		
	}

}
