package com.demo.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.pojo.Rating;



public interface RatingRepositary extends JpaRepository<Rating,Long> {

}
