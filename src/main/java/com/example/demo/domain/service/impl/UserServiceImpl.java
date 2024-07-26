package com.example.demo.domain.service.impl;

import com.example.demo.domain.model.Users;
import com.example.demo.domain.repository.UserRepository;
import com.example.demo.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<Users> findByIdOptional(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Users create(Users users) {
        if(users.getId() != null && userRepository.existsById(users.getId())){
            throw new IllegalArgumentException("This user ID already exists ");
        }
        return userRepository.save(users);
    }
}
