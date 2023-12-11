package com.kurylo.cqrs.simple.mapper;

import com.kurylo.cqrs.simple.command.UserCreateCommand;
import com.kurylo.cqrs.simple.domain.Address;
import com.kurylo.cqrs.simple.domain.ContactInformation;
import com.kurylo.cqrs.simple.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserCommandMapper {
    public User mapToUser(UserCreateCommand userCreateCommand) {
        var addressCommand = userCreateCommand.address();
        var address = Address.builder()
            .city(addressCommand.city())
            .street(addressCommand.street())
            .state(addressCommand.state())
            .zipCode(addressCommand.zipCode())
            .build();

        var contactInformationCommand = userCreateCommand.contactInformation();
        var contactInformation = ContactInformation.builder()
            .email(contactInformationCommand.email())
            .secondEmail(contactInformationCommand.secondEmail())
            .phone(contactInformationCommand.phone())
            .build();

        return new User(address, contactInformation);
    }
}
