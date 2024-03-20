package com.example.BeverageRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BeverageRest.movEntity.Beverage;
import com.example.BeverageRest.repo.BeverageRepo;


@Service
public class BeverageServiceImpl implements BeverageService {

	@Autowired
	BeverageRepo beverageRepo;
	
	
	@Override
	public List<Beverage> findAll() {
		// TODO Auto-generated method stub
		return beverageRepo.findAll();
	}

	@Override
	public Beverage findById(int id) {
		 
		return beverageRepo.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		 
		beverageRepo.deleteById(id);
	}

	@Override
	public void save(Beverage m) {
		 
		beverageRepo.save(m);
	}

	}

