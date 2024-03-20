package com.ibm.maven.Vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.maven.Vehicle.entity.Vehicle;
import com.ibm.maven.Vehicle.service.VehicleService;

@RestController
public class VehicleController {
	@Autowired
	VehicleService vehicleService;
	
	@GetMapping("/vehicle")
	List<Vehicle> findAll()
	{
		return vehicleService.findAll();
		
	}
	
	@GetMapping("/vehicle/{id}")
	Vehicle findById(@PathVariable int id)
	{
		return vehicleService.findById(id);
		
	}
	
	@PutMapping("/vehicle")
	void update(@RequestBody Vehicle vehicle)
	{
		vehicleService.save(vehicle);
		
	}
	@PostMapping("/vehicle")
	void save(@RequestBody Vehicle vehicle)
	{
		vehicleService.save(vehicle);
		
	}
	@DeleteMapping("/vehicle/{id}")
	void deleteById(@PathVariable int id)
	{
		vehicleService.deleteById(id);
		
	}
}