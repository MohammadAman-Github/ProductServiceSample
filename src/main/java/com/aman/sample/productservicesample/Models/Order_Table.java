package com.aman.sample.productservicesample.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Order_Table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;

    private long productId;
    private long customerId;
    private int quantity;
    private double price;
    private String productName;
    private String Description;
    private String Image;
    private String Category;



}
