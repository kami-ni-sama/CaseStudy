package com.wiley.main;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import com.wiley.bean.Rating;
//import com.wiley.service.RatingService;

@SpringBootApplication(scanBasePackages = "com.wiley")
@EnableJpaRepositories(basePackages = "com.wiley.persistence")
@EntityScan(basePackages = "com.wiley.bean")
@EnableEurekaClient
public class SpringbootMvcRestapiRatingApplication /*implements CommandLineRunner*/{

//	@Autowired
//	private RatingService ratingService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMvcRestapiRatingApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		ratingService.insertRating(new Rating(1, 1, 1, 9));
//		ratingService.insertRating(new Rating(1, 2, 2, 7));
//		ratingService.insertRating(new Rating(1, 3, 5, 8));
//		ratingService.insertRating(new Rating(1, 6, 8, 8));
//		ratingService.insertRating(new Rating(2, 1, 4, 7));
//		ratingService.insertRating(new Rating(2, 4, 6, 4));
//		ratingService.insertRating(new Rating(2, 2, 7, 6));
//		ratingService.insertRating(new Rating(2, 5, 9, 6));
//		
//	}

}
