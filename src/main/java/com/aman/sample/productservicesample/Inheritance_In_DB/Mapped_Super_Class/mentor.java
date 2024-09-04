package com.aman.sample.productservicesample.Inheritance_In_DB.Mapped_Super_Class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "msc_mentors")
public class mentor extends User{

    private double avg_rating;
    private String current_company;
}
