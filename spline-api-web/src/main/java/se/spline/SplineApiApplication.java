package se.spline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = {"se.spline"})
public class SplineApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SplineApiApplication.class, args);
	}

}
