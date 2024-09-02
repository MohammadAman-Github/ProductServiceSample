package com.aman.sample.productservicesample.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    long id;
    String name;
    String description;
    double price;
    String category;
    String image;

}
