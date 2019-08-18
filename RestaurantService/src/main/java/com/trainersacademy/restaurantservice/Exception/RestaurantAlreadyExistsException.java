package com.trainersacademy.restaurantservice.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "Restaurant already exists with the same details")
public class RestaurantAlreadyExistsException extends Exception {

}
