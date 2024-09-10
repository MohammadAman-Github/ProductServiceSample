package com.aman.sample.productservicesample.Cardinalities.ManytoOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class learners {
    @Id
    private int id;
    private String name;
    @ManyToOne
    private batch batch;
}
