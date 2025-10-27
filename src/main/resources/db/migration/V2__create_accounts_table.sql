-- V2__create_accounts_table.sql
CREATE TABLE accounts (
    id SERIAL PRIMARY KEY,
    platform VARCHAR(50) NOT NULL,
    username VARCHAR(50) NOT NULL,
    full_name VARCHAR(100),
    profile_pic_url TEXT,
    follower_count INT DEFAULT 0,
    following_count INT DEFAULT 0,
    media_count INT DEFAULT 0,
    user_id INT NOT NULL,

    CONSTRAINT fk_user FOREIGN KEY (user_id)
        REFERENCES users (id)
        ON DELETE CASCADE
);