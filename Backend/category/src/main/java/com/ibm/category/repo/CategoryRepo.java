package com.ibm.category.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.category.entity.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
