package com.onefeed.userservice.controllers;

import com.onefeed.userservice.dtos.UserDtoRequest;
import com.onefeed.userservice.mappers.UserDtoMapper;
import com.onefeed.userservice.models.User;
import com.onefeed.userservice.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;
    private final UserDtoMapper userDtoMapper;

    public UserController(UserService userService, UserDtoMapper userDtoMapper){
        this.userService = userService;
        this.userDtoMapper = userDtoMapper;
    }

    @PostMapping("/users")
    public ResponseEntity<Void> createuser(@RequestBody UserDtoRequest request){
        System.out.println("Incoming request: " + request);
        User user = userDtoMapper.toEntity(request);

        // Save entity
        userService.save(user);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
