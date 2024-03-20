package com.ibm.maven.SpringStudent.Medical;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HospitalList {
    
	String hosName;
	List<Doctor> doc=new ArrayList<Doctor>();
	
	List<Nurse> nur=new ArrayList<Nurse>();
	
	List<Department> dep=new ArrayList<Department>();
	
	List<Patient> pt=new ArrayList<Patient>();
	
	public String getHosName() {
		return hosName;
	}
	public void setHosName(String hosName) {
		this.hosName = hosName;
	}
	public List<Doctor> getDoc() {
		return doc;
	}
	public void setDoc(List<Doctor> doc) {
		this.doc = doc;
	}
	public List<Nurse> getNur() {
		return nur;
	}
	public void setNur(List<Nurse> nur) {
		this.nur = nur;
	}
	public List<Department> getDep() {
		return dep;
	}
	public void setDep(List<Department> dep) {
		this.dep = dep;
	}
	public List<Patient> getPt() {
		return pt;
	}
	public void setPt(List<Patient> pt) {
		this.pt = pt;
	}
	
	public void addDoc(Doctor d) {
		doc.add(d);
	}

	public void addNur(Nurse n) {
		nur.add(n);
	}

	public void addDept(Department dt) {
		dep.add(dt);
	}

	public void addPat(Patient p) {
		pt.add(p);
	}
	
	@Override
	public String toString() {
		return "HospitalList [hosName=" + hosName + ", doc=" + doc + ", nur=" + nur + ", dep=" + dep + ", pt=" + pt
				+ "]";
	}
	
	
	
	
	
}

