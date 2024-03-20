package com.ibm.pagingandsorting.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.pagingandsorting.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
