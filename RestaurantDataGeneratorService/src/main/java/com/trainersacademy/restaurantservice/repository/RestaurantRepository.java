package com.trainersacademy.restaurantservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.trainersacademy.restaurantservice.domain.Restaurant;

public interface RestaurantRepository extends MongoRepository<Restaurant, String> {
	
	public List<Restaurant> findByName(String name);
	
	public List<Restaurant> findByCity(String city);
	
	public List<Restaurant> findByState(String state);
	
	public List<Restaurant> findByNameAndCityAndState(String name, String city, String state);
	
	public List<Restaurant> findByNameAndCity(String name, String city);
	
	public List<Restaurant> findByNameAndState(String name, String state);
	
	public List<Restaurant> findByCityAndState(String city, String state);
	

}
