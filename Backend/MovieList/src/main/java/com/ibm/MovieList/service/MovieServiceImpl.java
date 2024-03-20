package com.ibm.MovieList.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.MovieList.entity.Movie;
import com.ibm.MovieList.repo.MovieRepo;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	MovieRepo movieRepo;
	
	
	@Override
	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		return movieRepo.findAll();
	}

	@Override
	public Movie findById(int id) {
		 
		return movieRepo.findById(id).get();
	}

	@Override
	public void save(Movie movie) {
		movieRepo.save(movie);
		
	}

	@Override
	public void deleteById(int id) {
		movieRepo.deleteById(id);
		
	}

}
