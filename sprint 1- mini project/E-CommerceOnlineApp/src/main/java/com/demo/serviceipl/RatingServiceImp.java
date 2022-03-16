package com.demo.serviceipl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.pojo.Product;
import com.demo.pojo.Rating;
import com.demo.productrepository.RatingRepositary;
import com.demo.service.RatingService;

@Component
public class RatingServiceImp implements RatingService {
	
	
	@Autowired
	RatingRepositary rateRepos;

	@Override
	public Rating addRatingDetails(Rating rate) {
		
		return rateRepos.save(rate);
	}
	
	
	

}
