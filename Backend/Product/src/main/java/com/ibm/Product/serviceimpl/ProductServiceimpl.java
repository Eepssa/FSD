package com.ibm.Product.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.ibm.Product.entity.Product;
import com.ibm.Product.repo.ProductRepo;
import com.ibm.Product.service.ProductService;
import com.ibm.Product.vo.*;

@Service
public class ProductServiceimpl implements ProductService{
	@Autowired
	ProductRepo productRepo;

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		List<Product> productList=productRepo.findAll();
		 
		String baseUrl="http://localhost:8080/cat/";
		for(Product p:productList)
		{
			String url=baseUrl+p.getCategoryId();
			RestClient restClient=  RestClient.create(url);
			Category cat = restClient.get() 
					  .uri(url) 
					  .retrieve() 
					  .body(Category.class); 
			
			p.setCategoryName(cat.getCategory());
			//prodListOp.add(p);
			
		}
	 
		return productList;
		
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		Product p= productRepo.findById(id).get();
		
		String url="http://localhost:8080/cat/"+id;
 		RestClient restClient=  RestClient.create(url);
 
		Category category = restClient.get() 
				  .uri(url) 
				  .retrieve() 
				  .body(Category.class); 
		p.setCategoryName(category.getCategory());
		
		return p;
	}

	@Override
	public void save(Product category) {
		// TODO Auto-generated method stub
		productRepo.save(category);
		
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		productRepo.deleteById(id);
	}

	@Override
	public List<Product> findByPriceOrderByProdNameAsc(double price) {
		// TODO Auto-generated method stub
		return productRepo.findByPriceOrderByProdNameAsc(price);
	}

	@Override
	public List<Product> findByProdNameStartingWith(String prodName) {
		// TODO Auto-generated method stub
		return productRepo.findByProdNameStartingWith(prodName);
	}

	@Override
	public List<Product> findByPriceBetween(double startSalary, double endSalary) {
		// TODO Auto-generated method stub
		List<Product> productList=productRepo.findAll();
		 
		String baseUrl="http://localhost:8080/cat/";
		for(Product p:productList)
		{
			String url=baseUrl+p.getCategoryId();
			RestClient restClient=  RestClient.create(url);
			Category cat = restClient.get() 
					  .uri(url) 
					  .retrieve() 
					  .body(Category.class); 
			
			p.setCategoryName(cat.getCategory());
		}
		return productRepo.findByPriceBetween(startSalary,endSalary);
	}
		
	public List<Product> findByProdNameLike(String likePattern){
		return productRepo.findByProdNameLike(likePattern);
	}
}
