package com.ibm.Product.service;
import com.ibm.Product.entity.*;
import java.util.List;

public interface ProductService {
	List<Product> findAll();
	Product findById(int id);
	void save(Product category);
	void deleteById(int id);
	List<Product> findByPriceOrderByProdNameAsc(double price);
	List<Product> findByProdNameStartingWith(String  prodName);
	List<Product> findByPriceBetween(double startSalary, double endSalary);
	List<Product> findByProdNameLike(String likePattern);
}
