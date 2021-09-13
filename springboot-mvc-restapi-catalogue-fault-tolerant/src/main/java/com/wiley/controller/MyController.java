package com.wiley.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.wiley.bean.Catalogue;
import com.wiley.bean.UserRating;
import com.wiley.service.CatalogueService;

@Controller
@SessionAttributes("catalogue")
public class MyController {

	@Autowired
	private CatalogueService catalogueService;
	
	@RequestMapping("/")
	public ModelAndView homePage() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/search")
	public ModelAndView searchPage() {
		return new ModelAndView("inputForSearch");
	}
	
//	@RequestMapping("/showCatalogue")
//	public ModelAndView showCatalogue(@RequestParam("uid") int uid) {
//		UserRating userRating = catalogueService.getUserRatingById(uid);
//		List<Catalogue> catalogue = new ArrayList<Catalogue>();
//		userRating.getUserRating().forEach(rating -> {
//			catalogue.add(new Catalogue(rating.getUserId(), catalogueService.getMovieById(rating.getMovieId()).getMovieName(), rating.getRate()));
//		});
//		return new ModelAndView("userCatalogue", "catalogue", catalogue);
//	}
}
