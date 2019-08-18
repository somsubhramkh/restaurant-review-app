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
@RequestMapping("/api/v1/restaurantservice")
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;

	@GetMapping
	public ResponseEntity listAllRestaurants() {

		return new ResponseEntity(restaurantService.listAllRestaurants(), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity getRestaurantByParameters(@RequestParam("name") String name,
			@RequestParam("city") String city, @RequestParam("state") String state)
			throws RestaurantDoesNotExistException {

		return new ResponseEntity(restaurantService.getRestaurantByParameters(name, city, state), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity getRestaurantByParameters(@RequestParam("Id") String id)
			throws RestaurantDoesNotExistException {

		return new ResponseEntity(restaurantService.getRestaurantById(id), HttpStatus.OK);
	}

}
