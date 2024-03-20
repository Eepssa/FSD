package com.ibm.pan1.service;

import java.util.List;

import com.ibm.pan1.entity.Pan;

public interface PanService {

	
	List<Pan> findAll();
	Pan findById(int id);
	void save(Pan pan);
	void deleteById(int id);
}