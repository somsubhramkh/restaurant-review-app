package com.trainersacademy.restaurantservice.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "No Restaurant is available for the specified search criteria")
public class RestaurantDoesNotExistException extends Exception {

}
