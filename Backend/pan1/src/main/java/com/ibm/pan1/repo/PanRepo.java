package com.ibm.pan1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.pan1.entity.Pan;



@Repository
public interface PanRepo extends JpaRepository<Pan, Integer> {

}