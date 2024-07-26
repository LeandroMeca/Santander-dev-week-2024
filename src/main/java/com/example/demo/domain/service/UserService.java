package com.example.demo.domain.service;

import com.example.demo.domain.model.Users;

import java.util.Optional;

public interface UserService {
    Optional<Users> findByIdOptional(Long id);
    Users create(Users users);
}
