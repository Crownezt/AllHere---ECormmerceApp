package com.ecommerce.allHere.data.repositories;

import com.ecommerce.allHere.data.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
