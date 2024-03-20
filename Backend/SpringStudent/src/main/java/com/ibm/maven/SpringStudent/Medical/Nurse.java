package com.ibm.maven.SpringStudent.Medical;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component @Scope("prototype")
public class Nurse {
	public Nurse(String nurName) {
		super();
		this.nurName = nurName;
	}

	String nurName;

	public String getNurName() {
		return nurName;
	}

	public void setNurName(String nurName) {
		this.nurName = nurName;
	}

	@Override
	public String toString() {
		return "Doctor [docName=" + nurName + "]";
	}

}
