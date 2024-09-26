package com.aman.sample.productservicesample.Advise;

import com.aman.sample.productservicesample.Exceptions.OrderNotFoundException;
import com.aman.sample.productservicesample.Exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdvise {
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String> getProductNotFoundException(ProductNotFoundException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatusCode.valueOf(400));
    }
    @ExceptionHandler(OrderNotFoundException.class)
    public ResponseEntity<String> getOrderNotFoundException(OrderNotFoundException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatusCode.valueOf(400));
    }
}
