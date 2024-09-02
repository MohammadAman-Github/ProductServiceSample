package com.aman.sample.productservicesample.Exceptions;

public class ProductNotFoundException extends  Exception {
    public ProductNotFoundException(String message) {
        super(message);
    }
}
