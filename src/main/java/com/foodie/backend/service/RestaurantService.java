package com.foodie.backend.service;

import com.foodie.backend.model.Restaurant;

import java.util.Optional;

public interface RestaurantService {

    Restaurant createRestaurant(Restaurant restaurant);

    Optional<Restaurant> getRestaurant(String id);

    void deleteRestaurant(String id);

    Restaurant updateRestaurant(String id, Restaurant restaurant);
}
