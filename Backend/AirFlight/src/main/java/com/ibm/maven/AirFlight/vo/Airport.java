package com.ibm.maven.AirFlight.vo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Airport {
@Autowired
List<Airline> air;
@Autowired
Map<String,List<Airline>> fl;
public List<Airline> getAir() {
	return air;
}
public void setAir(List<Airline> air) {
	this.air = air;
}
public Map<String, List<Airline>> getFl() {
	return fl;
}
public void setFl(Map<String, List<Airline>> fl) {
	this.fl = fl;
}
@Override
public String toString() {
	return "Airport [air=" + air + ", fl=" + fl + "]";
}




}
