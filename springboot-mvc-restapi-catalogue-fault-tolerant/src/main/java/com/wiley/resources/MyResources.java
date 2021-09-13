package com.wiley.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wiley.bean.Catalogue;
import com.wiley.bean.Catalogues;
import com.wiley.bean.Rating;
import com.wiley.bean.UserRating;
import com.wiley.service.CatalogueService;

@RestController
public class MyResources {

	@Autowired
	private CatalogueService catalogueService;
	
	@CrossOrigin
	@RequestMapping(path = "/catalogues/{uid}", method=RequestMethod.GET, produces = "Application/json")
	List<Catalogue> getCatalogueById(@PathVariable("uid") int uid) {
		return catalogueService.getCatalogueById(uid);
//		List<Rating> userRating = Arrays.asList(catalogueService.getUserRatingById(uid).getBody());
//		List<Catalogue> catalogues = new ArrayList<Catalogue>();
//		userRating.forEach(rating -> {
//			catalogues.add(new Catalogue(rating.getUserId(), catalogueService.getMovieById(rating.getMovieId()).getMovieName(), rating.getRate()));
//		});
//		return catalogues;
	}
}
