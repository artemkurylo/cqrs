package com.kurylo.cqrs.simple.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "contact_information_1")
public class ContactInformation {
    @Id
    @GeneratedValue
    private Long id;

    private String email;

    private String secondEmail;

    private String phone;
}
