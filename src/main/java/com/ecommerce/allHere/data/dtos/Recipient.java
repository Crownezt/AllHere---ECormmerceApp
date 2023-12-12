package com.ecommerce.allHere.data.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
public class Recipient {
    private String name;
    private String email;
}
