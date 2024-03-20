package com.ibm.maven.SpringStudent.Medical;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Hospital {
    
	String hosName;
	@Autowired
	Doctor doc;
	@Autowired
	Nurse nur;
	@Autowired
	Department dep;
	@Autowired
	Patient pt;
	public String getHosName() {
		return hosName;
	}
	public void setHosName(String hosName) {
		this.hosName = hosName;
	}
	public Doctor getDoc() {
		return doc;
	}
	public void setDoc(Doctor doc) {
		this.doc = doc;
	}
	public Nurse getNur() {
		return nur;
	}
	public void setNur(Nurse nur) {
		this.nur = nur;
	}
	public Department getDep() {
		return dep;
	}
	public void setDep(Department dep) {
		this.dep = dep;
	}
	public Patient getPt() {
		return pt;
	}
	public void setPt(Patient pt) {
		this.pt = pt;
	}
	@Override
	public String toString() {
		return "Hospital [hosName=" + hosName + ", doc=" + doc + ", nur=" + nur + ", dep=" + dep + ", pt=" + pt + "]";
	}
	
	
	
}
