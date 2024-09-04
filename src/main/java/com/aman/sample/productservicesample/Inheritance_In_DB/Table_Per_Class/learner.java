package com.aman.sample.productservicesample.Inheritance_In_DB.Table_Per_Class;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name = "tpc_learners")
public class learner extends User {
    private String college;
    private String company;
}
