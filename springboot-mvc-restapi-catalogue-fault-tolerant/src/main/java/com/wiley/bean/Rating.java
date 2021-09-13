package com.wiley.bean;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Rating {

	private int userId;
	private int movieId;
	private int ratingId;
	private int rate;
}
