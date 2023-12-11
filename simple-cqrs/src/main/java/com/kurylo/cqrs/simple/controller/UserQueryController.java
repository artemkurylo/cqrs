package com.kurylo.cqrs.simple.controller;

import java.util.List;

import com.kurylo.cqrs.simple.projection.UserProjection;
import com.kurylo.cqrs.simple.query.UserQueryModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserQueryController {
    private final UserProjection userProjection;

    public UserQueryController(UserProjection userProjection) {
        this.userProjection = userProjection;
    }

    @GetMapping
    public List<UserQueryModel> getAllUsers() {
        return userProjection.getAllUsers();
    }
}
