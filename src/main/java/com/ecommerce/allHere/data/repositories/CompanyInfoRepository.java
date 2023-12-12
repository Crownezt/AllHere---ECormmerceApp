package com.ecommerce.allHere.data.repositories;

import com.ecommerce.allHere.data.models.CompanyInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyInfoRepository extends JpaRepository<CompanyInfo, Long> {
}
