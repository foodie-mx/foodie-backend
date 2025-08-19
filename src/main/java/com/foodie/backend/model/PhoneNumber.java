package com.foodie.backend.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PhoneNumber {
    private String id;
    private String number;
    private String type;
}
