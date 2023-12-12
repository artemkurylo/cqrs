package com.kurylo.cqrs.simple.controller;

import java.util.List;

import com.kurylo.cqrs.simple.service.UserService;
import com.kurylo.cqrs.simple.query.UserQueryModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserQueryController {
    private final UserService userService;

    public UserQueryController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserQueryModel> getAllUsers() {
        return userService.getAllUsers();
    }
}
