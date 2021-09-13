package com.wiley.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiley.bean.Rating;
import com.wiley.persistence.RatingDao;

@Service
public class RatingServiceImpl implements RatingService{

	@Autowired
	private RatingDao ratingDao;

	@Override
	public Rating getRatingById(int id) {
		return ratingDao.getById(id);
	}

	@Override
	public Rating insertRating(Rating rating) {
		return ratingDao.save(rating);
	}

	@Override
	public List<Rating> getAllRatingByUserId(int uid) {
		return ratingDao.findRatingByUserId(uid);
	}

}
