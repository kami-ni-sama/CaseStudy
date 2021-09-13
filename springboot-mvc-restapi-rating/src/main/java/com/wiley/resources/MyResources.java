package com.wiley.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wiley.bean.Rating;
import com.wiley.service.RatingService;

@RestController
public class MyResources {

	@Autowired
	private RatingService ratingService;
	
	@CrossOrigin
	@RequestMapping(path="/ratings", method=RequestMethod.GET, produces="Application/json")
	Rating getRatingById(int id) {
		return ratingService.getRatingById(id);
	}

	@CrossOrigin
	@GetMapping(path="/ratings/{uid}", produces="Application/json")
	List<Rating> getUserRatingsById(@PathVariable("uid") int uid) {
		return ratingService.getAllRatingByUserId(uid);
	}
	
	@CrossOrigin
	@PostMapping(path="/ratings/", consumes="Application/json", produces="Application/json")
	Rating insertRating(@RequestBody Rating rating) {
		return ratingService.insertRating(rating);
	}
	
}
