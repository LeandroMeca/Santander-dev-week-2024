package com.example.demo.domain.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Checkout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Users user;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Product product;


    Date derpatureDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public Date getDerpatureDate() {
        return derpatureDate;
    }

    public void setDerpatureDate(Date derpatureDate) {
        this.derpatureDate = derpatureDate;
    }
}
