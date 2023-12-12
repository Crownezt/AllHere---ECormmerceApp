package com.ecommerce.allHere.data.repositories;

import com.ecommerce.allHere.data.models.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
