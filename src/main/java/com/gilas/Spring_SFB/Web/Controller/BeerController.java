package com.gilas.Spring_SFB.Web.Controller;


import com.gilas.Spring_SFB.Services.BeerService;
import com.gilas.Spring_SFB.Web.model.BeerDetails;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDetails> getBeer(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addBeer(@RequestBody BeerDetails beerDetails){
        BeerDetails savedBeer = beerService.saveNewBeer(beerDetails);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer" + savedBeer.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }


    @PutMapping("/{beerId}")
    public ResponseEntity updateBeer(@PathVariable("beerId") UUID bearId, @RequestBody BeerDetails beerDto){
        beerService.updateBeer(bearId, beerDto);
       return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateBeer(@PathVariable("beerId") UUID bearId){
        beerService.deleteBeer(bearId);
    }


}
