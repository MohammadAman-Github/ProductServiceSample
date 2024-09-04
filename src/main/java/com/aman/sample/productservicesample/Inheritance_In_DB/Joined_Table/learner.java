package com.aman.sample.productservicesample.Inheritance_In_DB.Joined_Table;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name = "JT_learners")
@PrimaryKeyJoinColumn(name = "user_id")
public class learner extends User {
    private String college;
    private String company;
}
