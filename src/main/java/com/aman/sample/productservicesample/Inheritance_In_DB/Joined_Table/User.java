package com.aman.sample.productservicesample.Inheritance_In_DB.Joined_Table;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
// (@Data == @Getters + @Setters)
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    private int id;
    private String name;
    private String email;
    private String password;
}
