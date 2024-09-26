package com.aman.sample.productservicesample.Repositories;

import com.aman.sample.productservicesample.Models.Order_Table;
import com.aman.sample.productservicesample.Models.Order_Table;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order_Table, Long> {

    Order_Table getOrderByOrderId(Long orderId);

    Order_Table getOrderByProductId(Long productId);

    Optional<Order_Table> getOrderByCustomerId(Long customerId);

    Optional<Order_Table> getOrderByProductIdAndQuantity(int productId, Integer quantity);
}
