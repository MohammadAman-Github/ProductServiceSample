package com.aman.sample.productservicesample.Inheritance_In_DB.Joined_Table;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name = "JT_mentors")
@PrimaryKeyJoinColumn(name = "user_id")
public class mentor extends User {

    private double avg_rating;
    private String current_company;
}
