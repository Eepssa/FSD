package com.ibm.category.service;
import java.util.List;
import com.ibm.category.entity.*;
public interface CategoryService {

	
	List<Category> findAll();
	Category findById(int id);
	void save(Category category);
	void deleteById(int id);
}
