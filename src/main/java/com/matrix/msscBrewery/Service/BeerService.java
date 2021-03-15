package com.matrix.msscBrewery.Service;

import com.matrix.msscBrewery.Web.Model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
