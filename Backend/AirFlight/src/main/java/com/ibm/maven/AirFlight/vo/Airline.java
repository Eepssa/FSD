package com.ibm.maven.AirFlight.vo;
import org.springframework.stereotype.Component;

//@Component
public class Airline {
	
 public Airline(String airCode, String name) {
		super();
		this.airCode = airCode;
		this.name = name;
	}

String airCode,name;

public String getAirCode() {
	return airCode;
}

public void setAirCode(String airCode) {
	this.airCode = airCode;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Airline [airCode=" + airCode + ", name=" + name + "]";
}
}
