package com.dbpostgresqltest.postgresql.controller;

import com.dbpostgresqltest.postgresql.model.UserDto;
import com.dbpostgresqltest.postgresql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAll() {
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserDto> insertUser(
            @RequestBody UserDto user
    ) {
        return new ResponseEntity<>(userRepository.save(user), HttpStatus.CREATED);
    }
}
