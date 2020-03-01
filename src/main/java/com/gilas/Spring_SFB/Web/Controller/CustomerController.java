package com.gilas.Spring_SFB.Web.Controller;


import com.gilas.Spring_SFB.Services.CustomerService;
import com.gilas.Spring_SFB.Web.model.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/{cussId}"})
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("cussId") UUID cussId){
        return new ResponseEntity<>(customerService.getCustomerById(cussId), HttpStatus.OK);
    }

}
