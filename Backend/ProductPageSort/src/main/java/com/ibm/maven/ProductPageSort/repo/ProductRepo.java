package com.ibm.maven.ProductPageSort.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ibm.maven.ProductPageSort.entity.Product;

public interface ProductRepo extends PagingAndSortingRepository<Product, Integer> {

    List<Product> findAllByPrice(double price, Page pageable);
}

