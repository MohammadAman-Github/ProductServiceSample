package com.aman.sample.productservicesample.Controller;

import com.aman.sample.productservicesample.DTOs.OrderRequestDto;
import com.aman.sample.productservicesample.Exceptions.OrderNotFoundException;
import com.aman.sample.productservicesample.Models.Order_Table;
import com.aman.sample.productservicesample.Models.Order_Table;
import com.aman.sample.productservicesample.Repositories.OrderRepository;
import com.aman.sample.productservicesample.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderServiceController {
    @Autowired
    public OrderService orderService;
    @Autowired
    private OrderRepository orderRepository;
    @PostMapping("/orders")
    public ResponseEntity<Order_Table> createorder(@RequestBody OrderRequestDto OrderDto) throws OrderNotFoundException {

        Order_Table order = orderService.createOrder(OrderDto);
        return new ResponseEntity<>(order, HttpStatusCode.valueOf(200));
    }

    @GetMapping("/OrderId/{id}")
    public ResponseEntity<Order_Table> getOrderId(@PathVariable Long id) throws OrderNotFoundException {
        Order_Table order = orderService.getOrderById(id);
        return new ResponseEntity<>(order, HttpStatusCode.valueOf(200));
    }


    @GetMapping("/CustomerId/{id}")
    public ResponseEntity<Order_Table> getOrderByCustomerId(@PathVariable Long id) throws OrderNotFoundException {
        Order_Table order = orderService.getOrderByCustomerId(id);
        return new ResponseEntity<>(order, HttpStatusCode.valueOf(200));
    }
}
