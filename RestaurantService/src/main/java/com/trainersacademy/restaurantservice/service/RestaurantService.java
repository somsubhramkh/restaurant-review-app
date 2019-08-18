package com.trainersacademy.restaurantservice.service;

import java.util.List;

import com.trainersacademy.restaurantservice.Exception.RestaurantDoesNotExistException;
import com.trainersacademy.restaurantservice.domain.Restaurant;

public interface RestaurantService {
	
	public Restaurant addRestaurant(Restaurant restaurant);
	
	public Restaurant getRestaurantById(String restaurantId) throws RestaurantDoesNotExistException;
	
	public List<Restaurant> listAllRestaurants();
	
	public List<Restaurant> getRestaurantByParameters(String name, String city, String state) throws RestaurantDoesNotExistException;

}
