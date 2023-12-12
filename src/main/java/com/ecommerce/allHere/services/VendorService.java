package com.ecommerce.allHere.services;

import com.ecommerce.allHere.data.dtos.VendorRequest;
import com.ecommerce.allHere.data.dtos.VendorResponse;
import com.ecommerce.allHere.data.models.AppUser;
import com.ecommerce.allHere.data.models.Vendor;
import org.springframework.stereotype.Service;

public interface VendorService {

    VendorResponse registerVendor(VendorRequest request);
}
