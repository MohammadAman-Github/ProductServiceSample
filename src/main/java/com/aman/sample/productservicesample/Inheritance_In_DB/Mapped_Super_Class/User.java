package com.aman.sample.productservicesample.Inheritance_In_DB.Mapped_Super_Class;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
// (@Data == @Getters + @Setters)
@MappedSuperclass
public class User {
    @Id
    private int id;
    private String name;
    private String email;
    private String password;
}
