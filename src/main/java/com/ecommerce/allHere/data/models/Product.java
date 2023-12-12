package com.ecommerce.allHere.data.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
