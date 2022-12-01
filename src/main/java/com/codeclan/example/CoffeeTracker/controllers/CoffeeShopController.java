package com.codeclan.example.CoffeeTracker.controllers;

import com.codeclan.example.CoffeeTracker.repositories.CoffeeShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeShopController {

    @Autowired
    CoffeeShopRepository coffeeShopRepository;

//    Get all the coffee shops stocking coffee
//    for a particular region.


    @GetMapping(value = "coffeeshop/region/{region}")
    public ResponseEntity getAllCoffeeShopsStockingCoffeeForARegion(@PathVariable String region){
        return new ResponseEntity<>(coffeeShopRepository.findCoffeeShopByRegion(region), HttpStatus.OK);
    }




}
