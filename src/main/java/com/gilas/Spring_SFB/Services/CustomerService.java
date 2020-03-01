package com.gilas.Spring_SFB.Services;

import com.gilas.Spring_SFB.Web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID cussId);
}
