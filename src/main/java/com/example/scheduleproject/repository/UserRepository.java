package com.example.scheduleproject.repository;


import com.example.scheduleproject.entity.User;

import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Optional<User> findByuserId(Long userId);

}
