package com.aman.sample.productservicesample.Inheritance_In_DB.Table_Per_Class;

import jakarta.persistence.*;
import lombok.Data;

@Data
// (@Data == @Getters + @Setters)
@Entity(name = "tpc_users")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {
    @Id
    private int id;
    private String name;
    private String email;
    private String password;
}
