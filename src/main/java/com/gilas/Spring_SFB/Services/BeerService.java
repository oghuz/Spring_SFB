package com.gilas.Spring_SFB.Services;

import com.gilas.Spring_SFB.Web.model.BeerDetails;

import java.util.UUID;

public interface BeerService {

    BeerDetails getBeerById(UUID beerId);

    BeerDetails saveNewBeer(BeerDetails beerDetails);
}
