package com.wiley.service;

import java.util.List;

import com.wiley.bean.Rating;

public interface RatingService {

	public Rating getRatingById(int id);
	public Rating insertRating(Rating rating);
	public List<Rating> getAllRatingByUserId(int uid);
}
