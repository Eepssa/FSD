package com.ibm.maven.SpringStudent.CarTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibm.maven.SpringStudent.CarService.CarService;

@Service
public class Ola implements CarService {
	
	
	public void getCar(Car c) {
		// TODO Auto-generated method stub
		System.out.println("Ola car"+c);
	}

}
