package com.ibm.maven.SpringStudent.Medical;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component @Scope("prototype")
public class Doctor {
	
	String docName;
	public Doctor(String docName) {
		super();
		this.docName = docName;
	}

	

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	@Override
	public String toString() {
		return "Doctor [docName=" + docName + "]";
	}

}
