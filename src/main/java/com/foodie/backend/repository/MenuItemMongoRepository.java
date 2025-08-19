package com.foodie.backend.repository;

import com.foodie.backend.model.MenuItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuItemMongoRepository extends MongoRepository<MenuItem, String> {
}