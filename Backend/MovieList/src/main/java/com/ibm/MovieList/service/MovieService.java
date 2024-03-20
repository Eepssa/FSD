package com.ibm.MovieList.service;

import java.util.List;

import com.ibm.MovieList.entity.Movie;


public interface MovieService {

	List<Movie> findAll();
	Movie findById(int id);
	void save(Movie movie);
	void deleteById(int id);
}
