package com.foodie.backend.service;

import com.foodie.backend.model.Restaurant;
import com.foodie.backend.repository.RestaurantMongoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MongoRestaurantMongoService implements RestaurantMongoService {

    @Autowired
    private final RestaurantMongoRepository restaurantMongoRepository;


    @Override
    public Restaurant createRestaurant(Restaurant restaurant) {
        return restaurantMongoRepository.save(restaurant);
    }

    @Override
    public Optional<Restaurant> getRestaurant(String id) {
        return restaurantMongoRepository.findById(id);
    }

    @Override
    public void deleteRestaurant(String id) {
        restaurantMongoRepository.deleteById(id);
    }

    @Override
    public Restaurant updateRestaurant(String id, Restaurant restaurant) {
        restaurant.setId(id);
        return restaurantMongoRepository.save(restaurant);
    }
}
