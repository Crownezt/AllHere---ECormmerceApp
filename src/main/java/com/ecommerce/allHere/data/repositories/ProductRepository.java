package com.ecommerce.allHere.data.repositories;

import com.ecommerce.allHere.data.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
