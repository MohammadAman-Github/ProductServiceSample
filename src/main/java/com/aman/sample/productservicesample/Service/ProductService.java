package com.aman.sample.productservicesample.Service;

import com.aman.sample.productservicesample.DTOs.updateProductpartiallyDto;
import com.aman.sample.productservicesample.Exceptions.ProductNotFoundException;
import com.aman.sample.productservicesample.Models.Product;

public interface ProductService {
    public Product getproductbyId(long id) throws ProductNotFoundException;

    public Product creatProduct(String name ,String description,double price,
                                String category ,String image);

    public Product updateProduct(long id, String name, String description, double price,
                          String category, String image) throws ProductNotFoundException;

    public void deleteProduct(long id) throws ProductNotFoundException;

    public Product updateProductpartillay(long id, updateProductpartiallyDto requestDto) throws ProductNotFoundException;
}
