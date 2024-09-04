package com.aman.sample.productservicesample.Inheritance_In_DB.Mapped_Super_Class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "msc_learners")
public class learner extends User{
    private String college;
    private String company;
}
