package com.aman.sample.productservicesample.Inheritance_In_DB.Table_Per_Class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "tpc_mentors")
public class mentor extends User {

    private double avg_rating;
    private String current_company;
}
