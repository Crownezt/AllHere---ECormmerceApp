package com.ecommerce.allHere.data.repositories;

import com.ecommerce.allHere.data.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
