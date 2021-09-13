package com.wiley.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wiley.bean.Movie;
import com.wiley.service.MovieService;

@RestController
public class MyRestController {

	@Autowired
	private MovieService movieService;
	
	@CrossOrigin
	@RequestMapping(path = "/movies/{mid}", method=RequestMethod.GET, produces = "Application/json")
	Movie getMovieById(@PathVariable("mid") int id) {
		return movieService.getMovieById(id);
	}
	
	@CrossOrigin
	@GetMapping(path="/movies", produces= "Application/json")
	List<String> getAllMovies() {
		return movieService.getAllMovies();
	}
	
	@CrossOrigin
	@RequestMapping(path = "/movies", method = RequestMethod.POST, produces = "Application/json", consumes = "Application/json")
	Movie saveMovie(@RequestBody Movie movie) {
		return movieService.insertMovie(movie);
	}
	
}
