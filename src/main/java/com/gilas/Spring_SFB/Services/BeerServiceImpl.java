package com.gilas.Spring_SFB.Services;

import com.gilas.Spring_SFB.Web.model.BeerDetails;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
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

    @Override
    public void deleteBeer(UUID bearId) {
        log.debug("Deleted Beer with ID: " + bearId);
    }
}
