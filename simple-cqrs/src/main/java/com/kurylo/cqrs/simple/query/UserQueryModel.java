package com.kurylo.cqrs.simple.query;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserQueryModel {
    private Long id;

    private AddressQueryModel addressQueryModel = new AddressQueryModel();
}
