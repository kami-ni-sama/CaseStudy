package com.wiley.main;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import com.wiley.bean.Movie;
//import com.wiley.service.MovieService;

@SpringBootApplication(scanBasePackages = "com.wiley")
@EnableJpaRepositories(basePackages = "com.wiley.persistence")
@EntityScan(basePackages = "com.wiley.bean")
@EnableEurekaClient
public class SpringbootMvcRestapiMovieApplication /*implements CommandLineRunner*/ {

//	@Autowired
//	private MovieService movieService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMvcRestapiMovieApplication.class, args);
//		ApplicationContext springContainer =  SpringApplication.run(SpringbootMvcRestapiMovieApplication.class, args);
//		MovieService movieService = (MovieService) springContainer.getBean("movieServiceImpl");
//		System.out.println(movieService.getMovieById(1));
	}

//	@Override
//	public void run(String... args) throws Exception {
//		movieService.insertMovie(new Movie(1, "La La Land"));
//		movieService.insertMovie(new Movie(2, "Transformers"));
//		movieService.insertMovie(new Movie(3, "The Phantom Thread"));
//		movieService.insertMovie(new Movie(4, "Portrait of a Lady on Fire"));
//		movieService.insertMovie(new Movie(5, "Kimi No Nawa"));
//		movieService.insertMovie(new Movie(6, "Blue is the Warmest Color"));
//		System.out.println(movieService.getMovieById(1));
//	}

}
