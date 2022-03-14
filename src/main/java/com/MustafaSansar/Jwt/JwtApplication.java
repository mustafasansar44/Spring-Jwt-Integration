package com.MustafaSansar.Jwt;

import com.MustafaSansar.Jwt.utils.Jwt.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtApplication.class, args);
	}

	@Bean
	public JwtFilter jwtFilter(){
		return new JwtFilter();
	}
}
