package com.ecommerce.allHere.data.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    @OneToMany(mappedBy = "order")
    private List<Product> products;
}
