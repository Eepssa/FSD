package com.ibm.Product.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="product_name")
	String prodName;
	
	@Column(name="price")
	double price;
	
	@Column(name="cat_id")
	int categoryId;
	
	@Transient
	String categoryName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Product(int id, String prodName, Double price, int categoryId, String categoryName) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.price = price;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", prodName=" + prodName + ", price=" + price + ", categoryId=" + categoryId
				+ ", categoryName=" + categoryName + "]";
	}
	
	
}
