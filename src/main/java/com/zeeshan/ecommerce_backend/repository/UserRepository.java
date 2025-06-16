package com.zeeshan.ecommerce_backend.repository;

import com.zeeshan.ecommerce_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
