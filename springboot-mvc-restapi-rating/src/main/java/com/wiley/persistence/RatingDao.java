package com.wiley.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wiley.bean.Rating;

@Repository
public interface RatingDao extends JpaRepository<Rating, Integer>{
	
	@Query("from Rating where userId=:uid ")
	List<Rating> findRatingByUserId(@Param("uid") int uid);

}
