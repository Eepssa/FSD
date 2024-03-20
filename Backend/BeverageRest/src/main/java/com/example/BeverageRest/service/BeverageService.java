package com.example.BeverageRest.service;

import java.util.List;

import com.example.BeverageRest.movEntity.Beverage;

public interface BeverageService {
	List<Beverage> findAll();
	Beverage findById(int id);
	void deleteById(int id);
	void save(Beverage m);
}
