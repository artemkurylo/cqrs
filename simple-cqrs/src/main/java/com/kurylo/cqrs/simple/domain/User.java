package com.kurylo.cqrs.simple.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "user_1")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @JoinColumn(name = "address_id", referencedColumnName = "id")
    @OneToOne
    private Address address = new Address();

    @JoinColumn(name = "contact_information_id", referencedColumnName = "id")
    @OneToOne
    private ContactInformation contactInformation = new ContactInformation();

    public User(Address address, ContactInformation contactInformation) {
        this.address = address;
        this.contactInformation = contactInformation;
    }
}
