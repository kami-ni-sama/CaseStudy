package com.wiley.service;

import java.util.List;

//import java.util.Collection;

import com.wiley.bean.Movie;

public interface MovieService {

	public Movie getMovieById(int id);
	public Movie insertMovie(Movie movie);
	public List<String> getAllMovies();
}
