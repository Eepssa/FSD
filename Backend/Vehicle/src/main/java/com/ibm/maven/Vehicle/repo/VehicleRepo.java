package com.ibm.maven.Vehicle.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.maven.Vehicle.entity.Vehicle;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, Integer> {

}
