package com.ibm.pagingandsorting.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.ibm.pagingandsorting.entity.Book;

public interface BookService {
	
	List<Book> findAll();
	Book findById(int id);
	void save(Book book);
	void deletById(int id);
	List<Book> findAllWithSorting(String field);
	Page<Book> findAllWithPaging(int offset, int pageSize);
	Page<Book> findAllWithPagingAndSorting(int offset, int pageSize, String field);
}
