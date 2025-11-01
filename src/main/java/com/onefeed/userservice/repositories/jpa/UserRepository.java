package com.onefeed.userservice.repositories.jpa;

import com.onefeed.userservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
