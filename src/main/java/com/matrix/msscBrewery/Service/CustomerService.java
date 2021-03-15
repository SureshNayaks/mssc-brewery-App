package com.matrix.msscBrewery.Service;

import com.matrix.msscBrewery.Web.Model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getByCustomerId(UUID id);
}
