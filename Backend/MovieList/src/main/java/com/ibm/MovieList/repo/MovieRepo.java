package com.ibm.MovieList.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.MovieList.entity.Movie;


@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {

}

