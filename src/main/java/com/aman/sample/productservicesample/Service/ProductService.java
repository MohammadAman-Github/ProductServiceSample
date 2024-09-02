package com.aman.sample.productservicesample.Service;

import com.aman.sample.productservicesample.Exceptions.ProductNotFoundException;
import com.aman.sample.productservicesample.Models.Product;

public interface ProductService {
    public Product getproductbyId(long id) throws ProductNotFoundException;
}
