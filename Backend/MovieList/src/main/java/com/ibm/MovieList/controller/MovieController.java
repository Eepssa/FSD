package com.ibm.MovieList.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.MovieList.entity.Movie;
import com.ibm.MovieList.service.MovieService;

@RestController
public class MovieController {
	@Autowired
	MovieService movieService;
	
	@GetMapping("/movie")
	List<Movie> findAll()
	{
		return movieService.findAll();
		
	}
	
	@GetMapping("/movie/{id}")
	Movie findById(@PathVariable int id)
	{
		return movieService.findById(id);
		
	}
	
	@PutMapping("/movie")
	void update(@RequestBody Movie movie)
	{
		movieService.save(movie);
		
	}
	@PostMapping("/movie")
	void save(@RequestBody Movie movie)
	{
		movieService.save(movie);
		
	}
	@DeleteMapping("/movie/{id}")
	void deleteById(@PathVariable int id)
	{
		movieService.deleteById(id);
		
	}
}