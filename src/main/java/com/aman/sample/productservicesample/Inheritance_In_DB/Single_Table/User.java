package com.aman.sample.productservicesample.Inheritance_In_DB.Single_Table;

import jakarta.persistence.*;
import lombok.Data;

@Data
// (@Data == @Getters + @Setters)
@Entity(name = "sc_users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "User")
public class User {
    @Id
    private int id;
    private String name;
    private String email;
    private String password;
}
