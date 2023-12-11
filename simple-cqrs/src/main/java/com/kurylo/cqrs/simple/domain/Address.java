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

@Entity(name = "address_1")
public class Address {
    @Id
    @GeneratedValue
    private Long id;

    private String street;

    private String city;

    private String state;

    private String zipCode;
}
