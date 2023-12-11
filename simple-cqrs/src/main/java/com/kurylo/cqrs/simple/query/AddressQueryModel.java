package com.kurylo.cqrs.simple.query;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressQueryModel {
    private String street;

    private String city;

    private String state;

    private String zipCode;
}
