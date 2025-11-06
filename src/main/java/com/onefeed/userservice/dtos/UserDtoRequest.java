package com.onefeed.userservice.dtos;

import lombok.Data;

@Data
public class UserDtoRequest {
    private String username;
    private String password;
    private String fullName;
}
