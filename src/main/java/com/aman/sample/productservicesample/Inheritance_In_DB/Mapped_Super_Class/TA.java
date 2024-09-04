package com.aman.sample.productservicesample.Inheritance_In_DB.Mapped_Super_Class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "msc_TAs")
public class TA extends  User{
    private int numOfQuestions;
    private String college;
}
