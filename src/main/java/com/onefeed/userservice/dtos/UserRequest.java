package com.onefeed.userservice.dtos;

import lombok.Data;

@Data
public class UserRequest {
    String username;
    String password;
    String fullName;
}
