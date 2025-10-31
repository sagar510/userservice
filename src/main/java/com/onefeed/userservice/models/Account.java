package com.onefeed.userservice.models;

import com.onefeed.userservice.enums.Platform;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "platform", nullable = false)
    private Platform platform;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "full_name", nullable = false)
    private String full_name;

    @Column(name = "profile_pic_url")
    private String profilePicUrl;

    @Column(name = "follower_count", nullable = false)
    private int followerCount = 0;

    @Column(name = "following_count", nullable = false)
    private int followingCount = 0;

    @Column(name = "media_count", nullable = false)
    private int mediaCount = 0;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
