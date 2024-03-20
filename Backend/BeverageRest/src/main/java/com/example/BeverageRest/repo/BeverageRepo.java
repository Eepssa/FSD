package com.example.BeverageRest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BeverageRest.movEntity.Beverage;

@Repository
public interface BeverageRepo extends JpaRepository<Beverage, Integer>{

}
