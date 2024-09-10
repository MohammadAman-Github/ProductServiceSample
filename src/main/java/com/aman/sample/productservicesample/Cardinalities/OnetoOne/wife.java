package com.aman.sample.productservicesample.Cardinalities.OnetoOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class wife {
    @Id
    private int id;
    private String name;

    @OneToOne
    private Husband husband;
}
