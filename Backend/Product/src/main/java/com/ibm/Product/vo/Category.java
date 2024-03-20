package com.ibm.Product.vo;

public class Category {
	int id;
	String Category;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public Category(int id, String category) {
		super();
		this.id = id;
		Category = category;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", Category=" + Category + "]";
	}
	
	
}
