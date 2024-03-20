package com.ibm.maven.SpringStudent.v0;

import org.springframework.stereotype.Component;

@Component
public class Student {
	String name;
	int roll;
	float marks;
	@Override
	public String toString() {
		return "Stduent [name=" + name + ", roll=" + roll + ", marks=" + marks + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
}
