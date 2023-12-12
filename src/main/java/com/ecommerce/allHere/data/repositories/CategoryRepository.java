package com.ecommerce.allHere.data.repositories;

import com.ecommerce.allHere.data.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
