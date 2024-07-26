package com.example.demo.domain.repository;

import com.example.demo.domain.model.AmountProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AmountRepository extends JpaRepository<AmountProduct,Long> {
}
