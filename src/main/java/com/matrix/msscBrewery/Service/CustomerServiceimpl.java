package com.matrix.msscBrewery.Service;

import com.matrix.msscBrewery.Web.Model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceimpl implements CustomerService{
    @Override
    public CustomerDto getByCustomerId(UUID id) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("suresh")
                .build();
    }
}
