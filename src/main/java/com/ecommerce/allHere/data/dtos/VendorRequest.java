package com.ecommerce.allHere.data.dtos;

import com.ecommerce.allHere.data.models.Category;
import com.ecommerce.allHere.data.models.Payment;
import com.ecommerce.allHere.data.models.Product;
import lombok.Getter;
import java.util.List;
@Getter

public class VendorRequest {

    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private Category category;
    private List<Product> product;
    private List<Payment> paymentDetails;
}
