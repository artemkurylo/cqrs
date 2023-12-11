package com.kurylo.cqrs.simple.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.kurylo.cqrs.simple.domain.User;
import com.kurylo.cqrs.simple.query.AddressQueryModel;
import com.kurylo.cqrs.simple.query.UserQueryModel;
import org.springframework.stereotype.Component;

@Component
public class UserQueryMapper {
    public List<UserQueryModel> mapToUserQueryModel(List<User> users) {
        return users.stream()
            .map(this::mapToUserQueryModel)
            .collect(Collectors.toList());
    }

    public UserQueryModel mapToUserQueryModel(User user) {
        var address = user.getAddress();
        var addressQueryModel = AddressQueryModel.builder()
            .city(address.getCity())
            .street(address.getStreet())
            .state(address.getState())
            .zipCode(address.getZipCode())
            .build();

        return UserQueryModel.builder()
            .id(user.getId())
            .addressQueryModel(addressQueryModel)
            .build();
    }
}
