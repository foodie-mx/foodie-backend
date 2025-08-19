package com.foodie.backend.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private String id;
    private String street;
    private String streetNumber;
    private String city;
    private String state;
    private String zipCode;
}
