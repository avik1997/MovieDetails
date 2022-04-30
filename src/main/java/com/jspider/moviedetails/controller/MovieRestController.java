package com.jspider.moviedetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.moviedetails.constants.MovieConstant;
import com.jspider.moviedetails.dto.Movie;
import com.jspider.moviedetails.service.MovieService;

@RequestMapping(value = "/")
@RestController
public class MovieRestController {
	
	@Autowired
	private MovieService movieservice; 
	
	@GetMapping(value=MovieConstant.Get_All_MovieDetails)
	public @ResponseBody List<Movie> getAllMovieDetails(){
		return movieservice.getAll();
	}
	
	@PostMapping(value =MovieConstant.SAVE_REGISTER)
	public void saveMovie(@RequestBody Movie movie) {
		movieservice.saveRegisterDetails(movie);
	}
	@GetMapping(value =MovieConstant.Get_MovieDetails)
	public  Movie  getMovieDetails(@RequestBody @PathVariable("id") Long id) {
		System.out.println(id);
		Movie byId = movieservice.getById(id);
		System.out.println(byId);
		return byId;
	}
	
	@DeleteMapping(value = MovieConstant.Delete_MovieDetails)
	public int deleteMovieRecord(@RequestBody @RequestParam("moviename") String moviename) {
		return movieservice.deleteByName(moviename);
	}

}
