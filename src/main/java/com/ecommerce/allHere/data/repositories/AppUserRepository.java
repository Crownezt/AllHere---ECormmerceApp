package com.ecommerce.allHere.data.repositories;

import com.ecommerce.allHere.data.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}
