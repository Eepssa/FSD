package com.ibm.pan1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pan")
public class Pan {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	int id;

	@Column(name="Number")
	String number;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPan() {
		return number;
	}

	public void setPan(String number) {
		this.number = number;
	}

	public Pan(int id, String number) {
		super();
		this.id = id;
		this.number = number;
	}

	public Pan() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pan [id=" + id + ", Number=" + number + "]";
	}
	
	
	
}