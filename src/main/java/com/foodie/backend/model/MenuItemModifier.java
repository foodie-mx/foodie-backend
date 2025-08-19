package com.foodie.backend.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MenuItemModifier {
    private String name;
    private double priceDelta;
}
