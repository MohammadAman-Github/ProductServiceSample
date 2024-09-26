package com.aman.sample.productservicesample.Cardinalities.ManytoMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Student {

    @Id
    private int id;
    private String name;

    @ManyToMany
    private List<Course> courses;
}
