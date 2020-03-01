package com.gilas.Spring_SFB.Services;

import com.gilas.Spring_SFB.Web.model.BeerDetails;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDetails getBeerById(UUID beerId) {
        return BeerDetails.builder().id(UUID.randomUUID())
                                    .bearName("Belkin Apple")
                                    .bearStyle("Non Alco")
                                    .build();
    }

    @Override
    public BeerDetails saveNewBeer(BeerDetails beerDetails) {
        return BeerDetails.builder()
                            .id(UUID.randomUUID())
                            .bearName("Belkin Peach")
                            .build();
    }

    @Override
    public void updateBeer(UUID bearId, BeerDetails beerDto) {
        BeerDetails.builder()
                    .id(beerDto.getId())
                    .bearName(beerDto.getBearName())
                    .bearStyle(beerDto.getBearStyle())
                    .build();

    }
}
