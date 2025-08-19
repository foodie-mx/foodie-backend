package com.foodie.backend.service;

import com.foodie.backend.error.EntityNotFoundException;
import com.foodie.backend.model.MenuItem;
import com.foodie.backend.repository.MenuItemMongoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MenuItemMongoService implements MenuItemService {

    private final MenuItemMongoRepository menuItemMongoRepository;

    @Override
    public Optional<MenuItem> getMenuItem(String id) {
        return menuItemMongoRepository.findById(id);
    }

    @Override
    public MenuItem createMenuItem(MenuItem menuItem) {
        return menuItemMongoRepository.save(menuItem);
    }

    @Override
    public void deleteMenuItem(String id) {
        if (!menuItemMongoRepository.existsById(id)) {
            throw new EntityNotFoundException("MenuItem Not Found");
        }
        menuItemMongoRepository.deleteById(id);
    }

    @Override
    public MenuItem updateMenuItem(String id, MenuItem menuItem) {
        if (!menuItemMongoRepository.existsById(id)) {
            throw new EntityNotFoundException("MenuItem Not Found");
        }
        menuItem.setId(id);
        return menuItemMongoRepository.save(menuItem);
    }
}