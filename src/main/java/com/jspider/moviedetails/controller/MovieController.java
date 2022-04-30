package com.jspider.moviedetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jspider.moviedetails.constants.MovieConstant;
import com.jspider.moviedetails.dto.Movie;
import com.jspider.moviedetails.service.MovieService;


@Controller
@RequestMapping(value = "/")
public class MovieController {
	
	@Autowired
	private MovieService movieservice;
	
	@PostMapping(value = MovieConstant.REGISTER)
	public ModelAndView register(Movie movie)
	{
		System.out.println(movie);
		movieservice.saveRegisterDetails(movie);;
		return new ModelAndView("home.jsp");
	}

}
