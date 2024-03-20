package com.ibm.pagingandsorting.entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	@Id
	int id;

	@Column(name = "book_name")
	String name;

	@Column(name = "book_price")
	int price;

	@Column(name = "sold")
	int sold;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String name, int price, int sold) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.sold = sold;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSold() {
		return sold;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", sold=" + sold + "]";
	}

}
