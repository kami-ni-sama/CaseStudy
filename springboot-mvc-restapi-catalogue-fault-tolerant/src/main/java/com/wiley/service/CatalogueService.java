package com.wiley.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wiley.bean.Catalogue;
import com.wiley.bean.Movie;
import com.wiley.bean.Rating;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class CatalogueService {

	@Autowired
	private RestTemplate restTemplate;
	
	private ResponseEntity<Rating[]> getUserRatingById(int id) {
//		return restTemplate.getForEntity("http://localhost:8082/ratings/"+id, Rating[].class);
		return restTemplate.getForEntity("http://rating-service/ratings/"+id, Rating[].class);
		
	}
	
	@CircuitBreaker(name = "movieIds", fallbackMethod = "movieIdsFallback")
	private Movie getMovieById(int movieId) {
//		return restTemplate.getForObject("http://localhost:8080/movies/"+movieId, Movie.class);
		return restTemplate.getForObject("http://movie-service/movies/"+movieId, Movie.class);
	}
	
	private Movie movieIdsFallback(Exception e) {
		return new Movie();
	}
	
	@CircuitBreaker(name = "catalogueIds", fallbackMethod = "catalogueIdsFallback")
	public List<Catalogue> getCatalogueById(int uid) {
		List<Rating> userRating = Arrays.asList(getUserRatingById(uid).getBody());
		List<Catalogue> catalogues = new ArrayList<Catalogue>();
		userRating.forEach(rating -> {
			catalogues.add(new Catalogue(rating.getUserId(), getMovieById(rating.getMovieId()).getMovieName(), rating.getRate()));
		});
		return catalogues;
	}
	
	private List<Catalogue> catalogueIdsFallback(Exception e) {
		List<Catalogue> catalogues = new ArrayList<Catalogue>();
		catalogues.add(new Catalogue());
		return catalogues;
	}
	
}
