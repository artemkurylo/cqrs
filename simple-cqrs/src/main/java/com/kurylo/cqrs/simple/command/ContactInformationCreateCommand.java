package com.kurylo.cqrs.simple.command;

public record ContactInformationCreateCommand(String email, String secondEmail, String phone) {
}
