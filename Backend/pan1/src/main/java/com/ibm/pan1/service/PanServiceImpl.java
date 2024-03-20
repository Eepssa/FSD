package com.ibm.pan1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.pan1.entity.Pan;
import com.ibm.pan1.repo.PanRepo;

@Service
public class PanServiceImpl implements PanService {
	@Autowired
	PanRepo panRepo;
	
	
	@Override
	public List<Pan> findAll() {
		// TODO Auto-generated method stub
		return panRepo.findAll();
	}

	@Override
	public Pan findById(int id) {
		 
		return panRepo.findById(id).get();
	}

	@Override
	public void save(Pan pan) {
		panRepo.save(pan);
		
	}

	@Override
	public void deleteById(int id) {
		panRepo.deleteById(id);
		
	}

}

