package com.example.practice.service;

import com.example.practice.domain.user.User;
import com.example.practice.dto.request.UserCreateRequest;
import com.example.practice.dto.response.UserResponse;
import com.example.practice.repository.user.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(UserCreateRequest request) {
        userRepository.save(new User(request.getName(), request.getAge()));
    }

    public void deleteUser(String name) {
        User user = userRepository.findByName(name).orElseThrow(IllegalAccessError::new);
        userRepository.delete(user);
    }

    public List<UserResponse> findAllUser() {
        return userRepository.findAll().stream()
                .map(user -> new UserResponse(user.getId(), user.getAge(),user.getName()))
                .collect(Collectors.toList());
    }

}
