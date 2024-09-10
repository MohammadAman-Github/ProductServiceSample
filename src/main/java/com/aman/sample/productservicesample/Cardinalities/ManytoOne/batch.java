package com.aman.sample.productservicesample.Cardinalities.ManytoOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class batch {
    @Id
    private int id;
    private String name;
    @OneToMany (mappedBy = "batch")
    List<learners> learners;
}
