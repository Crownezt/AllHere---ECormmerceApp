package com.ecommerce.allHere.data.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String userName;
    private String fullName;
    @Column(unique = true)
    private String email;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;
    @Column(columnDefinition = "Timestamp")
    private LocalDate dateCreated;
    @Column(unique = true)
    private String phoneNumber;
    private String address;
    private boolean isAdmin;
    private boolean isCustomer;
    private boolean isVendor;
}
