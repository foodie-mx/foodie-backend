package com.foodie.backend.service;

import com.foodie.backend.model.MenuItem;

import java.util.Optional;

public interface MenuItemService {
    Optional<MenuItem> getMenuItem(String id);

    MenuItem createMenuItem(MenuItem menuItem);

    void deleteMenuItem(String id);

    MenuItem updateMenuItem(String id, MenuItem menuItem);
}
