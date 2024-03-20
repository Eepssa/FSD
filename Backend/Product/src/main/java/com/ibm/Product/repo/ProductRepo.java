package com.ibm.Product.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.Product.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	List<Product> findByPriceOrderByProdNameAsc(double price);
	List<Product> findByProdNameStartingWith(String prodName);
	List<Product> findByPriceBetween(double startSalary, double endSalary);
	List<Product> findByProdNameLike(String likePattern);
}
