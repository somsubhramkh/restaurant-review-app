package com.trainersacademy.restaurantservice;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.trainersacademy.restaurantservice.domain.Restaurant;
import com.trainersacademy.restaurantservice.domain.RestaurantList;
import com.trainersacademy.restaurantservice.service.PopulationService;
import com.trainersacademy.restaurantservice.service.PopulationServiceImpl;

@SpringBootApplication
public class RestaurantDataGeneratorServiceApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(RestaurantDataGeneratorServiceApplication.class, args);
	}

}
