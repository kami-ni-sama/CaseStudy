package com.wiley.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiley.bean.Movie;
import com.wiley.persistence.MovieDao;

@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	private MovieDao movieDao;
	
	@Override
	public Movie getMovieById(int id) {
		return movieDao.getById(id);
	}

	@Override
	public Movie insertMovie(Movie movie) {
		return movieDao.save(movie);
	}
	
	public List<String> getAllMovies() {
		return movieDao.getAllMovies();
	}
	
}
