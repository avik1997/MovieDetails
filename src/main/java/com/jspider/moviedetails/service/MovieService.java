package com.jspider.moviedetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.moviedetails.dto.Movie;
import com.jspider.moviedetails.repository.MovieRepository;


@Service
public class MovieService {

	@Autowired
	private MovieRepository movierepository;
	
	public void saveRegisterDetails(Movie movie) {
		movierepository.saveRegisterDetails(movie);
	}
	
	public List<Movie> getAll() {
		return movierepository.getMovieAll();
	}
	
	public Movie getById(Long id) {
		return movierepository.getMovieById(id);	
	}
	public int deleteByName(String name) {
		return movierepository.deleteMovieByName(name);
	}
}
