package com.foodie.backend.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("menu_items")
@Data
@Builder
public class MenuItem {
    @Id
    private String id;
    private String name;
    private double price;
    private String category;
    private String description;
    private String image;
    private List<MenuItemModifier> modifiers; // Reference to the restaurant this item belongs to
}
