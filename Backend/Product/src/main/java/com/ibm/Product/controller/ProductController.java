package com.ibm.Product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.Product.service.ProductService;
import com.ibm.Product.entity.*;


@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	
	@GetMapping("/prod")
	List<Product> findAll()
	{
		return productService.findAll();
		
	}
	
	@GetMapping("/prod/{id}")
	Product findById(@PathVariable int id)
	{
		return productService.findById(id);
		
	}
	
	@PostMapping("/prod")
	void save(@RequestBody Product product)
	{
		productService.save(product);
		
	}
	
	@GetMapping("/prodprice/{price}")
	List<Product> findByPriceOrderByProdNameAsc( @PathVariable double price)
	{
		return productService.findByPriceOrderByProdNameAsc(price);
		
	}
	
	@GetMapping("/prodname/{name}")
	List<Product> findByProdNameStartingWith(@PathVariable String name)
	{
		return productService.findByProdNameStartingWith(name);
		
	}
	
	@GetMapping("/prodlike/{likePattern}")
	List<Product> findByProdNameLike(@PathVariable String likePattern)
	{
		return productService.findByProdNameLike(likePattern);
		
	}
	@GetMapping("/prodname/{startSalary}/{endSalary}")
	List<Product> findByPriceBetween(@PathVariable double startSalary,@PathVariable double endSalary)
	{
		return productService.findByPriceBetween(startSalary,endSalary);
		
	}
	@PutMapping("/prod")
	void update(@RequestBody Product product)
	{
		productService.save(product);
		
	}
	
	@DeleteMapping("/prod/{id}")
	void deleteById(@PathVariable int id)
	{
		productService.deleteById(id);
		
	}
}
