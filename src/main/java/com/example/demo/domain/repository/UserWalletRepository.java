package com.example.demo.domain.repository;

import com.example.demo.domain.model.UserWallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserWalletRepository extends JpaRepository<UserWallet,Long> {
}
