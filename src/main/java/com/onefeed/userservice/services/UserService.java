package com.onefeed.userservice.services;

import com.onefeed.userservice.models.User;
import com.onefeed.userservice.repositories.jpa.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User save(User user){
        return userRepository.save(user);
    }
}
