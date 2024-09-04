package com.aman.sample.productservicesample.Inheritance_In_DB.Joined_Table;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name = "JT_TAs")
@PrimaryKeyJoinColumn(name = "user_id")
public class TA extends User {
    private int numOfQuestions;
    private String college;
}
