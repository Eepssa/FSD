package com.ibm.maven.Vehicle.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.maven.Vehicle.entity.Vehicle;
import com.ibm.maven.Vehicle.repo.VehicleRepo;

@Service
public class VehicleServiceImpl implements VehicleService {
	@Autowired
	VehicleRepo vehicleRepo;
	
	
	@Override
	public List<Vehicle> findAll() {
		// TODO Auto-generated method stub
		return vehicleRepo.findAll();
	}

	@Override
	public Vehicle findById(int id) {
		 
		return vehicleRepo.findById(id).get();
	}

	@Override
	public void save(Vehicle vehicle) {
		vehicleRepo.save(vehicle);
		
	}

	@Override
	public void deleteById(int id) {
		vehicleRepo.deleteById(id);
		
	}

}
