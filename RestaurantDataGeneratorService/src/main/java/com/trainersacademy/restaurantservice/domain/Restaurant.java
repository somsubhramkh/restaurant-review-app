package com.trainersacademy.restaurantservice.domain;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Restaurant {
	@JsonProperty("id")
	private String restaurantId;
	private String name;
	private String address;
	private String city;
	private String state;
	private String area;
	@JsonProperty("postal_code")
	private String postalCode;
	private String country;
	@JsonProperty("price")
	private int priceCategory;
	@JsonProperty("image_url")
	private String imageUrl;
	
	public Restaurant() {
	
	}

	public Restaurant(String restaurantId, String name, String address, String city, String state, String area,
			String postalCode, String country, int priceCategory, String imageUrl) {
		this.restaurantId = restaurantId;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.area = area;
		this.postalCode = postalCode;
		this.country = country;
		this.priceCategory = priceCategory;
		this.imageUrl = imageUrl;
	}

	public String getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPriceCategory() {
		return priceCategory;
	}

	public void setPriceCategory(int priceCategory) {
		this.priceCategory = priceCategory;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", name=" + name + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", area=" + area + ", postalCode=" + postalCode + ", country=" + country
				+ ", priceCategory=" + priceCategory + ", imageUrl=" + imageUrl + "]";
	}
	
	
	
	
	

}
