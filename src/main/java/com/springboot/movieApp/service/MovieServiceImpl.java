package com.springboot.movieApp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.movieApp.dao.MovieDao;
import com.springboot.movieApp.entity.Movie;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieDao movieDao;
	
	private Movie movie;
	@Override
	public Movie getMovieById(int movieId) {
		// TODO Auto-generated method stub
		return movieDao.findById(movieId).get();
	}
 
	@Override
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return movieDao.findAll();
	}
 
	@Override
	public Movie saveMovieDetails(Movie movie) {
		// TODO Auto-generated method stub
		return movieDao.save(movie);
	}
 
	@Override
	public List<Movie> saveMultipleMovieDetails(List<Movie> movieList) {
		// TODO Auto-generated method stub
//		for(Movie movie : movieList) {
//			movieDao.save(movie);
//		}
		return movieDao.saveAll(movieList);
	}
 
	@Override
	public Movie updateMovieDetails(Movie movie) {
		// TODO Auto-generated method stub
		Movie existingMovie = getMovieById(movie.getMovieId());
		existingMovie.setCoverPhotoUrl(movie.getCoverPhotoUrl());
		existingMovie.setDuration(movie.getDuration());
		existingMovie.setMovieDescription(movie.getMovieDescription());
		existingMovie.setMovieId(movie.getMovieId());
		existingMovie.setMovieName(movie.getMovieName());
		existingMovie.setReleaseDate(movie.getReleaseDate());
		existingMovie.setTrailerUrl(movie.getTrailerUrl());
		return movieDao.save(existingMovie);
	}
 
	@Override
	public boolean deleteMovie(int movieId) {
		// TODO Auto-generated method stub
		Movie existingMovie = getMovieById(movieId);
		if(existingMovie == null) {
			return false;
		}
		else {
		movieDao.deleteById(movieId);
		return true;
		}
	}
 
	@Override
	public List<Movie> getMoviesByGenre(String genre) {
		// TODO Auto-generated method stub
		List<Movie> movies=movieDao.getByGenre(genre);
		movies.stream().filter(list->list.getGenre().equals(genre)).collect(Collectors.toList());
		return movies;
	}
 

}
