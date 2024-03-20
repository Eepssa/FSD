package com.ibm.MovieList.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	int id;
    @Column(name="name")
	String name; 
    @Column(name="imbd_rating")
	double imdbRate;
	@Column(name="genre")
	String genre;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getImdbRate() {
		return imdbRate;
	}
	public void setImdbRate(double imdbRate) {
		this.imdbRate = imdbRate;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Movie(int id, String name, double imdbRate, String genre) {
		super();
		this.id = id;
		this.name = name;
		this.imdbRate = imdbRate;
		this.genre = genre;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", imdbRate=" + imdbRate + ", genre=" + genre + "]";
	}  
	
}
