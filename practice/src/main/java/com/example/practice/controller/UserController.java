package com.example.practice.controller;

import com.example.practice.dto.request.UserCreateRequest;
import com.example.practice.dto.request.UserUpdateRequest;
import com.example.practice.dto.response.UserResponse;
import com.example.practice.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public void saveUser(@RequestBody UserCreateRequest request) {
        userService.saveUser(request);
    }

    @DeleteMapping("/user")
    public void deleteUser(@RequestParam String name) {
        userService.deleteUser(name);
    }

    @GetMapping("/user")
    public List<UserResponse> findUser() {
        return userService.findAllUser();
    }

    @PutMapping("/user") // update
    public UserResponse updateUser(@RequestBody UserUpdateRequest request) {
        return userService.update(request);
    }
}
