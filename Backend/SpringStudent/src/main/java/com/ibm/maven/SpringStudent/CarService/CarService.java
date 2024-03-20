package com.ibm.maven.SpringStudent.CarService;

import org.springframework.stereotype.Component;

import com.ibm.maven.SpringStudent.CarTypes.Car;

@Component
public interface CarService {
void getCar(Car cr);
}
