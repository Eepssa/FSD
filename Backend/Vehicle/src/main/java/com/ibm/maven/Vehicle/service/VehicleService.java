package com.ibm.maven.Vehicle.service;
import java.util.List;

import com.ibm.maven.Vehicle.entity.Vehicle;

public interface VehicleService {

	
	List<Vehicle> findAll();
	Vehicle findById(int id);
	void save(Vehicle vehicle);
	void deleteById(int id);
}
