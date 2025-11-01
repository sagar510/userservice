package com.onefeed.userservice.controllers;

import com.onefeed.userservice.dtos.UserRequest;
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

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/users")
    public ResponseEntity<Void> createuser(@RequestBody UserRequest request){
        System.out.println("Incoming request: " + request);
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFullName(request.getFullName());

        // Save entity
        userService.save(user);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
