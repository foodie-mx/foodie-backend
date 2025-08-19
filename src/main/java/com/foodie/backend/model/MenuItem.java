package com.foodie.backend.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("menu_items")
@Data
@Builder
public class MenuItem {
    private String id;
    private String name;
    private double price;
    private String category;
    private String description;
    private String image;
}
