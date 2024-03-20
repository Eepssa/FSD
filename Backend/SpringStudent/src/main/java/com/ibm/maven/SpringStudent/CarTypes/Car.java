package com.ibm.maven.SpringStudent.CarTypes;

import org.springframework.stereotype.Component;

@Component
public class Car {
String carName;
int carNo;
public String getCarName() {
	return carName;
}
public void setCarName(String carName) {
	this.carName = carName;
}
public int getCarNo() {
	return carNo;
}
public void setCarNo(int carNo) {
	this.carNo = carNo;
}
@Override
public String toString() {
	return "Car [carName=" + carName + ", carNo=" + carNo + "]";
}
}
