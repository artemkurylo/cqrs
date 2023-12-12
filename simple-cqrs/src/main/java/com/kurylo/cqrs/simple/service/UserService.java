package com.kurylo.cqrs.simple.service;

import java.util.List;

import com.kurylo.cqrs.simple.mapper.UserQueryMapper;
import com.kurylo.cqrs.simple.query.UserQueryModel;
import com.kurylo.cqrs.simple.repository.UserQueryRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserQueryRepository userQueryRepository;
    private final UserQueryMapper userQueryMapper;

    public UserService(UserQueryRepository userQueryRepository, UserQueryMapper userQueryMapper) {
        this.userQueryRepository = userQueryRepository;
        this.userQueryMapper = userQueryMapper;
    }

    public List<UserQueryModel> getAllUsers() {
        var users = userQueryRepository.findAll();

        return userQueryMapper.mapToUserQueryModel(users);
    }
}
