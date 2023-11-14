package com.springboot.movieApp.service;

import java.util.List;

import com.springboot.movieApp.entity.Movie;

public interface MovieService {
	
	public Movie getMovieById(int movieId);
	public List<Movie> getAllMovies();
	public Movie saveMovieDetails(Movie movie);
	public List<Movie> saveMultipleMovieDetails(List<Movie> movieList);
	public Movie updateMovieDetails(Movie movie);
	public boolean deleteMovie(int movieId);
	public List<Movie> getMoviesByGenre(String genre);

}
