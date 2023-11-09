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
    private Gender gender;
    private LocalDate dateCreated;
    @Column(unique = true)
    private String phoneNumber;
    private String address;
}
