package com.onefeed.userservice.mappers;

import com.onefeed.userservice.dtos.UserDtoRequest;
import com.onefeed.userservice.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoMapper {
    public User toEntity(UserDtoRequest userDto){
        return User.builder()
                .username(userDto.getUsername())
                .password(userDto.getPassword())
                .fullName(userDto.getFullName())
                .build();
    }
}
