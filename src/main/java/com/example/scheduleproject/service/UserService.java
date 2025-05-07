package com.example.scheduleproject.service;

import com.example.scheduleproject.dto.UserResponseDto;
import com.example.scheduleproject.dto.UserSaveRequestDto;
import com.example.scheduleproject.entity.User;
import com.example.scheduleproject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserResponseDto save(UserSaveRequestDto requestDto){
        User user = new User(
                requestDto.getUserId(),
                requestDto.getEmail(),
                requestDto.getName()
        );

        User saveUser = userRepository.save(user);

        return new UserResponseDto(
                saveUser.getUserId(),
                saveUser.getName(),
                saveUser.getEmail()
        );

    }





}
