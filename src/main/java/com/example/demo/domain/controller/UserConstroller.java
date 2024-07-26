package com.example.demo.domain.controller;

import com.example.demo.domain.model.Users;
import com.example.demo.domain.service.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserConstroller {

private final UserService userService;

    public UserConstroller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Users>> findById(@PathVariable Long id){
        var users = userService.findByIdOptional(id);
        return ResponseEntity.ok(users);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Users> create(@RequestBody Users users){
        var userCreate = userService.create(users);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreate.getId())
                .toUri();
        return ResponseEntity.created(location).body(userCreate);
    }


}
