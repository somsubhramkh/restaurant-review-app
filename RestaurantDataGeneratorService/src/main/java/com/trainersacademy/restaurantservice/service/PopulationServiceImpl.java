package com.trainersacademy.restaurantservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.trainersacademy.restaurantservice.domain.Restaurant;
import com.trainersacademy.restaurantservice.domain.RestaurantList;
import com.trainersacademy.restaurantservice.repository.RestaurantRepository;

@Service
public class PopulationServiceImpl implements PopulationService {
	
	
	private RestTemplate restTemplate;
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	String url = "http://opentable.herokuapp.com/api/restaurants?state=GA&per_page=100";
	

	@Override
	public RestaurantList populateRestaurantDataFromApi() {
		restTemplate = new RestTemplate();
		RestaurantList restaurantList = restTemplate.getForObject(url, RestaurantList.class);
		restaurantRepository.saveAll(restaurantList.getRestaurants());
		return restaurantList;
	}

}
