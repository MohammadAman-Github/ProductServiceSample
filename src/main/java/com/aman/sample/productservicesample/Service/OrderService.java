package com.aman.sample.productservicesample.Service;

import com.aman.sample.productservicesample.DTOs.OrderRequestDto;
import com.aman.sample.productservicesample.Exceptions.OrderNotFoundException;
import com.aman.sample.productservicesample.Models.Order_Table;
import com.aman.sample.productservicesample.Models.Order_Table;

public interface OrderService  {
    public Order_Table createOrder(OrderRequestDto OrderRequest) throws OrderNotFoundException;
   public Order_Table getOrderById(Long OrderId) throws OrderNotFoundException;
   public Order_Table getOrderByCustomerId(Long CustomerId) throws OrderNotFoundException;
}
