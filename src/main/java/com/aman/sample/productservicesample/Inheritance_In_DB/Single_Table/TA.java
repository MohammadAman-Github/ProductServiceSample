package com.aman.sample.productservicesample.Inheritance_In_DB.Single_Table;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("sc_tas")
public class TA extends User {
    private int numOfQuestions;
    private String college;
}
