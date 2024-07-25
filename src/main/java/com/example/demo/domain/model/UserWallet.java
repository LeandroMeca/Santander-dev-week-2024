package com.example.demo.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class UserWallet {

    @Id
    private Long id;

    @Column(precision = 13, scale = 2)
    private BigDecimal wallet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getWallet() {
        return wallet;
    }

    public void setWallet(BigDecimal wallet) {
        this.wallet = wallet;
    }
}
