package com.trainersacademy.restaurantservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trainersacademy.restaurantservice.Exception.RestaurantDoesNotExistException;
import com.trainersacademy.restaurantservice.service.RestaurantService;

@RestController
@RequestMapping("/api/v1/restaurantservice/admin")
public class RestaurantAdminController {

	@Autowired
	private RestaurantService restaurantService;

	@GetMapping
	public ResponseEntity populateRestaurants() {

		return new ResponseEntity(restaurantService.listAllRestaurants(), HttpStatus.OK);
	}


}
