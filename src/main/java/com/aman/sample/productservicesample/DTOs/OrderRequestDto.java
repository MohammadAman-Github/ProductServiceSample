package com.aman.sample.productservicesample.DTOs;

import lombok.Data;

@Data
public class OrderRequestDto {
    private int product_id;
    private String product_name;
    private String product_description;
    private double product_price;
    private String product_image;
    private String product_category;
    private int product_quantity;
    private long customer_id;
}
