package com.ecommerce.allHere.data.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class CompanyInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long Id;
    private String name;
    private String address;
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Product> products;
    private Category category;
}
