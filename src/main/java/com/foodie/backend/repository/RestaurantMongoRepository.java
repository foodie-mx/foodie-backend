package com.foodie.backend.repository;

import com.foodie.backend.model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestaurantMongoRepository extends MongoRepository<Restaurant, String> {
}
