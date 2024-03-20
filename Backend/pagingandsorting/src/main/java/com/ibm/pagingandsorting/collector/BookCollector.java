package com.ibm.pagingandsorting.collector;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.pagingandsorting.dto.APIResponse;
import com.ibm.pagingandsorting.entity.Book;
import com.ibm.pagingandsorting.service.BookService;

@RestController
public class BookCollector {

	@Autowired
	BookService service;

	@GetMapping("/books")
	APIResponse<List<Book>> findAll() {
		List<Book> books = service.findAll();
		return new APIResponse<>(books.size(), books);
	}

	@GetMapping("/books/{id}")
	APIResponse<Book> findById(@PathVariable int id) {
		Book book = service.findById(id);
		return new APIResponse<>(1, book);
	}

	@PutMapping("/books")
	void update(@RequestBody Book book) {
		service.save(book);
	}

	@PostMapping("/books")
	void save(@RequestBody Book book) {
		service.save(book);
	}

	@DeleteMapping("/books/{id}")
	void deleteById(@PathVariable int id) {
		service.deletById(id);
	}

	@GetMapping("/books/{field}")
	APIResponse<List<Book>> findAllWithSorting(@PathVariable String field) {
		List<Book> books = service.findAllWithSorting(field);
		return new APIResponse<>(books.size(), books);
	}

	@GetMapping("/books/paging/{pageSize}/{offset}")
	APIResponse<Page<Book>> findAllWithPaging(@PathVariable int pageSize, @PathVariable int offset) {
		Page<Book> pages = service.findAllWithPaging(offset, pageSize);
		return new APIResponse<>(pages.getSize(), pages);
	}

	@GetMapping("/books/pagingandsorting/{field}/{pageSize}/{offset}")
	private APIResponse<Page<Book>> getProductsWithPaginationAndSort(@PathVariable int offset,
			@PathVariable int pageSize, @PathVariable String field) {
		Page<Book> pages = service.findAllWithPagingAndSorting(offset, pageSize, field);
		return new APIResponse<>(pages.getSize(), pages);
	}

}
