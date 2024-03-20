package com.example.BeverageRest.movEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="beverage")
public class Beverage {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id ;
	
	@Column(name="beverage_name")
	String beverageName;

	
	
	public Beverage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Beverage(int id, String beverageName) {
		super();
		this.id = id;
		this.beverageName = beverageName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBeverageName() {
		return beverageName;
	}

	public void setBeverageName(String beverageName) {
		this.beverageName = beverageName;
	}

	@Override
	public String toString() {
		return "Beverage [id=" + id + ", beverageName=" + beverageName + "]";
	}
}
	
