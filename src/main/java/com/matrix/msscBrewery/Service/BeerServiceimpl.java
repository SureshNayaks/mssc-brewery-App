package com.matrix.msscBrewery.Service;

import com.matrix.msscBrewery.Web.Model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceimpl implements BeerService{
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Copycat")
                .beerStyle("suresh")
                .upc(10000).build();
    }
}
