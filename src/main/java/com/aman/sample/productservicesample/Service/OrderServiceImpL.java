package com.aman.sample.productservicesample.Service;

import com.aman.sample.productservicesample.DTOs.OrderRequestDto;
import com.aman.sample.productservicesample.Exceptions.OrderNotFoundException;
import com.aman.sample.productservicesample.Models.Order_Table;
import com.aman.sample.productservicesample.Models.Order_Table;
import com.aman.sample.productservicesample.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpL implements OrderService{
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public Order_Table createOrder(OrderRequestDto OrderRequest) throws OrderNotFoundException {
        Optional<Order_Table> order_table = orderRepository.getOrderByProductIdAndQuantity(OrderRequest.getProduct_id(),
                OrderRequest.getProduct_quantity());
        if(order_table.isEmpty()) {
            Order_Table order = new Order_Table();
            order.setProductId(OrderRequest.getProduct_id());
            order.setProductName(OrderRequest.getProduct_name());
            order.setDescription(OrderRequest.getProduct_description());
            order.setCategory(OrderRequest.getProduct_category());
            order.setQuantity(OrderRequest.getProduct_quantity());
            order.setPrice(OrderRequest.getProduct_price()*order.getQuantity());
            order.setImage(OrderRequest.getProduct_image());
            order.setCustomerId(OrderRequest.getCustomer_id());
            order = orderRepository.save(order);
            return order;
        }
        else {
            throw new OrderNotFoundException("Same Product with the same quantity is already Exists");
        }
    }

    @Override
    public Order_Table getOrderById(Long OrderId) throws OrderNotFoundException{

        Order_Table order = orderRepository.getOrderByOrderId(OrderId);
        if(order == null)
        {
            throw new OrderNotFoundException("Order with OrderId " + OrderId + " was not found");
        }

        return order;

    }

    @Override
    public Order_Table getOrderByCustomerId(Long CustomerId) throws OrderNotFoundException {
        Optional <Order_Table> order_table = orderRepository.getOrderByCustomerId(CustomerId);
        if(order_table.isPresent())
        {
            Order_Table order_Table = order_table.get();
            return order_Table;
        }
        else{
            throw new OrderNotFoundException("Order with CustomerId " + CustomerId + " was not found");
        }
    }


}
