package com.kurylo.cqrs.simple.command;

public record AddressCreateCommand(String street, String city, String state, String zipCode) {
}
