package com.ibm.maven.Vehicle.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vehicle")
public class Vehicle {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	int id;
    @Column(name="Registartion_Number")
	String regdNo; 
    @Column(name="Cylinder_Capacity")
	double cyl_cap;
	@Column(name="Make")
	String make;  
	@Column(name="Price")
	double price;
	public Vehicle(int id, String regdNo, double cyl_cap, String make, double price) {
		super();
		this.id = id;
		this.regdNo = regdNo;
		this.cyl_cap = cyl_cap;
		this.make = make;
		this.price = price;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegdNo() {
		return regdNo;
	}
	public void setRegdNo(String regdNo) {
		this.regdNo = regdNo;
	}
	public double getCyl_cap() {
		return cyl_cap;
	}
	public void setCyl_cap(double cyl_cap) {
		this.cyl_cap = cyl_cap;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", regdNo=" + regdNo + ", cyl_cap=" + cyl_cap + ", make=" + make + ", price="
				+ price + "]";
	}
	
	
}

	  
