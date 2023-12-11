package com.kurylo.cqrs.simple.aggregator;

import com.kurylo.cqrs.simple.command.UserCreateCommand;
import com.kurylo.cqrs.simple.mapper.UserCommandMapper;
import com.kurylo.cqrs.simple.repository.UserCommandRepository;
import org.springframework.stereotype.Service;

@Service
public class UserAggregator {
    private final UserCommandRepository userCommandRepository;
    private final UserCommandMapper userCommandMapper;

    public UserAggregator(UserCommandRepository userCommandRepository, UserCommandMapper userCommandMapper) {
        this.userCommandRepository = userCommandRepository;
        this.userCommandMapper = userCommandMapper;
    }

    public void createUser(UserCreateCommand userCreateCommand) {
        var user = userCommandMapper.mapToUser(userCreateCommand);

        userCommandRepository.save(user);
    }

    public void deleteUser(Long id) {
        userCommandRepository.deleteUserById(id);
    }
}
