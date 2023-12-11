package com.kurylo.cqrs.simple.command;

public record UserCreateCommand(AddressCreateCommand address, ContactInformationCreateCommand contactInformation) {
}
