package com.example.demo.domain.repository;

import com.example.demo.domain.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {
}
