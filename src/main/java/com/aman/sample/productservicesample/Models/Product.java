package com.aman.sample.productservicesample.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product {

    @Id
    long id;
    String name;
    String description;
    double price;
    String category;
    String image;

}
