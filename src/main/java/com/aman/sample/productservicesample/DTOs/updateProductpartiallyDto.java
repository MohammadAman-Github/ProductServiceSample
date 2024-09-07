package com.aman.sample.productservicesample.DTOs;

import lombok.Data;

@Data
public class updateProductpartiallyDto {

    String name;
    String description;
    double price;
    String category;
    String image;
}
