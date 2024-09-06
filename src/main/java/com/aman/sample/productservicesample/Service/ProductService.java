package com.aman.sample.productservicesample.Service;

import com.aman.sample.productservicesample.Exceptions.ProductNotFoundException;
import com.aman.sample.productservicesample.Models.Product;

public interface ProductService {
    public Product getproductbyId(long id) throws ProductNotFoundException;

    public Product creatProduct(String name ,String description,double price,
                                String category ,String image);


}
