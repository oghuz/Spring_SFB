package com.gilas.Spring_SFB.Services;

import com.gilas.Spring_SFB.Web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID cussId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                                    .name("Osmanjan")
                                    .build();
    }
}
