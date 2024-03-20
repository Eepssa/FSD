package com.ibm.pagingandsorting.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ibm.pagingandsorting.entity.Book;
import com.ibm.pagingandsorting.repo.BookRepo;
import com.ibm.pagingandsorting.service.BookService;

import jakarta.annotation.PostConstruct;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepo repository;

	@PostConstruct
	public void initDB() {
		List<Book> books = new ArrayList<>();

		Random random = new Random();
		for (int i = 1; i <= 200; i++) {
			int leftLimit = 97; // letter 'a'
			int rightLimit = 122; // letter 'z'
			int targetStringLength = 10;

			String name = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength)
					.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
			int price = random.nextInt(10000);
			int sold = random.nextInt(500);
			books.add(new Book(i, name, price, sold));
		}
		repository.saveAll(books);
	}

	@Override
	public List<Book> findAll() {
		return repository.findAll();
	}

	@Override
	public Book findById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public void save(Book book) {
		repository.save(book);
	}

	@Override
	public void deletById(int id) {
		repository.deleteById(id);
	}

	@Override
	public List<Book> findAllWithSorting(String field) {
		return repository.findAll(Sort.by(field));
	}

	@Override
	public Page<Book> findAllWithPaging(int offset, int pageSize) {
		return repository.findAll(PageRequest.of(offset, pageSize));
	}

	@Override
	public Page<Book> findAllWithPagingAndSorting(int offset, int pageSize, String field) {
		return repository.findAll(PageRequest.of(offset, pageSize).withSort(Sort.by(field)));
	}

}
