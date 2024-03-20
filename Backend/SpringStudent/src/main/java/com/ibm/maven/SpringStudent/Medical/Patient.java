package com.ibm.maven.SpringStudent.Medical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component @Scope("prototype")
public class Patient {
public Patient(String patName) {
		super();
		this.patName = patName;
	}

String patName;

public String getPatName() {
	return patName;
}

public void setPatName(String patName) {
	this.patName = patName;
}

@Override
public String toString() {
	return "Patient [patName=" + patName + "]";
}
}
