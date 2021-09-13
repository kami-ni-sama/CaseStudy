package com.wiley.persistence;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wiley.bean.Movie;

@Repository
public interface MovieDao extends JpaRepository<Movie, Integer> {

	@Query("select movieName from Movie")
	List<String> getAllMovies();
}
