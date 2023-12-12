package com.ecommerce.allHere.data.repositories;

import com.ecommerce.allHere.data.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
