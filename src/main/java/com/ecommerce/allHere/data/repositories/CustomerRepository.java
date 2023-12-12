package com.ecommerce.allHere.data.repositories;

import com.ecommerce.allHere.data.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
