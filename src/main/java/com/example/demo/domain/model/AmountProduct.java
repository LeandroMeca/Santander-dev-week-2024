package com.example.demo.domain.model;

import jakarta.persistence.*;

@Entity
public class AmountProduct {

    @Id
    private Long id;
    private int amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
