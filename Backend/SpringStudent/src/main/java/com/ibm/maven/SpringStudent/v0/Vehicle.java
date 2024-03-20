package com.ibm.maven.SpringStudent.v0;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
 int vehno;

public int getVehno() {
	return vehno;
}

public void setVehno(int vehno) {
	this.vehno = vehno;
}
}
