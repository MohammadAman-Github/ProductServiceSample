package com.aman.sample.productservicesample.Exceptions;

public class OrderNotFoundException extends Exception {
    public OrderNotFoundException(String message) {
        super(message);
    }
}
