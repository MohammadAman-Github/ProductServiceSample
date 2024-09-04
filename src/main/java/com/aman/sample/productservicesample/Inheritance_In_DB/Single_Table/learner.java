package com.aman.sample.productservicesample.Inheritance_In_DB.Single_Table;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("sc_learners")
public class learner extends User {
    private String college;
    private String company;
}
