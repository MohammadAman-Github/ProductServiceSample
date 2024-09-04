package com.aman.sample.productservicesample.Inheritance_In_DB.Table_Per_Class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "tpc_TAs")
public class TA extends User {
    private int numOfQuestions;
    private String college;
}
