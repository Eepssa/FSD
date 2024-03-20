package com.ibm.maven.SpringStudent.Medical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component @Scope("prototype")
public class Department {
	public Department(String dept) {
		super();
		this.dept = dept;
	}

	String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Department [dept=" + dept + "]";
	}
	

}
