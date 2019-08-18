package com.trainersacademy.restaurantservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trainersacademy.restaurantservice.service.PopulationService;

@RestController
@RequestMapping("/api/v1/restaurantgenerator")
public class RestaurantGeneratorController {

	@Autowired
	private PopulationService populationService;
	
	@GetMapping
	public ResponseEntity populateRestaurants() {
	
		populationService.populateRestaurantDataFromApi();
		return new ResponseEntity(HttpStatus.CREATED);
		
	}
}
