package com.foodie.backend.controller;

import com.foodie.backend.error.EntityNotFoundException;
import com.foodie.backend.model.Restaurant;
import com.foodie.backend.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static com.foodie.backend.service.ApiConstants.API_V1;
import static com.foodie.backend.service.ApiConstants.ID;

@RestController
@RequiredArgsConstructor
@RequestMapping(API_V1 + "/restaurant")
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping(ID)
    @ResponseBody
    public Restaurant getRestaurant(@PathVariable String id) {
        return restaurantService.getRestaurant(id)
                .orElseThrow(() -> new EntityNotFoundException("Restaurant Not Found"));
    }

    @PostMapping
    @ResponseBody
    public Restaurant createRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.createRestaurant(restaurant);
    }

    @DeleteMapping(ID)
    public void deleteRestaurant(@PathVariable String id) {
        restaurantService.deleteRestaurant(id);
    }

    @PutMapping(ID)
    public Restaurant updateRestaurant(@PathVariable String id, @RequestBody Restaurant restaurant) {
        return restaurantService.updateRestaurant(id, restaurant);
    }
}
