package com.ecommerce.allHere.services;

import com.ecommerce.allHere.data.dtos.VendorRequest;
import com.ecommerce.allHere.data.dtos.VendorResponse;
import com.ecommerce.allHere.data.models.*;
import com.ecommerce.allHere.data.repositories.VendorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class VendorServicesImpl implements VendorService {

    private final VendorRe vendorRepository;

    public VendorResponse registerVendor(VendorRequest request){

        AppUser appUser = new AppUser();
        appUser.setVendor(true);
        appUser.setUserName(request.getName());
        appUser.setAddress(request.getAddress());
        appUser.setEmail(request.getEmail());
        appUser.setPhoneNumber(request.getPhoneNumber());
        appUser.setDateCreated(LocalDate.parse(LocalDate.now().toString()));

        CompanyInfo companyInfo = new CompanyInfo();
        companyInfo.setAddress(appUser.getAddress());
        companyInfo.setName(appUser.getUserName());
        companyInfo.setCategory(request.getCategory());
        companyInfo.setProducts(request.getProduct());

        Vendor vendor = new Vendor();
        vendor.setCompanyInfo(companyInfo);
        vendor.setAppUser(appUser);

        vendorRepository.save(vendor);

        return new VendorResponse("Successfully created");
    }
}
