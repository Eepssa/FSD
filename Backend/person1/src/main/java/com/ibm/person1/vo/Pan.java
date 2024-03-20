package com.ibm.person1.vo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

 
public class Pan {
	
	int id; 
	String pan;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public Pan(int id, String pan) {
		super();
		this.id = id;
		this.pan = pan;
	}

	public Pan() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "pan [id=" + id + ", pan=" + pan + "]";
	}
	
	
	
}