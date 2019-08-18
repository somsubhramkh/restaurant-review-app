package com.trainersacademy.restaurantservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.trainersacademy.restaurantservice.Exception.RestaurantDoesNotExistException;
import com.trainersacademy.restaurantservice.domain.Restaurant;
import com.trainersacademy.restaurantservice.repository.RestaurantRepository;

public class RestaurantServiceImpl implements RestaurantService {
	
	@Autowired
	private RestaurantRepository restaurantRepository;

	@Override
	public Restaurant addRestaurant(Restaurant restaurant) {
		
		return restaurantRepository.save(restaurant);
		
	}

	@Override
	public Restaurant getRestaurantById(String restaurantId) throws RestaurantDoesNotExistException {
		
		Restaurant restaurant = restaurantRepository.findById(restaurantId).get();
		
		if(restaurant==null) {
			
			throw new RestaurantDoesNotExistException();
		}
		
		return restaurant;
	}

	@Override
	public List<Restaurant> listAllRestaurants() {
		
		return restaurantRepository.findAll();
	}

	@Override
	public List<Restaurant> getRestaurantByParameters(String name, String city, String state)
			throws RestaurantDoesNotExistException {
		
		if(name!=null && city!=null && state!=null) {
			return restaurantRepository.findByNameAndCityAndState(name, city, state);
		}
		else if(name!=null && city!=null && state==null) {
			return restaurantRepository.findByNameAndCity(name, city);
		}
		else if(name!=null && city==null && state!=null) {
			return restaurantRepository.findByNameAndState(name, state);
		}
		else if(name==null && city!=null && state!=null) {
			return restaurantRepository.findByCityAndState(city, state);
		}
		else if(name!=null && city==null && state==null) {
			return restaurantRepository.findByName(name);
		}
		else if(name==null && city!=null && state==null) {
			return restaurantRepository.findByCity(city);
		}
		else if(name==null && city==null && state!=null) {
			return restaurantRepository.findByState(state);
		}
		
		return null;
	}

}
