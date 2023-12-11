package com.kurylo.cqrs.simple.controller;

import com.kurylo.cqrs.simple.aggregator.UserAggregator;
import com.kurylo.cqrs.simple.command.UserCreateCommand;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserCommandController {
    private final UserAggregator userAggregator;

    public UserCommandController(UserAggregator userAggregator) {
        this.userAggregator = userAggregator;
    }

    @PostMapping
    public void createUser(@RequestBody UserCreateCommand userCreateCommand) {
        userAggregator.createUser(userCreateCommand);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userAggregator.deleteUser(id);
    }
}
