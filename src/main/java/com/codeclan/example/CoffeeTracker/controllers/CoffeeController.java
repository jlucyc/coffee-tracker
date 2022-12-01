package com.codeclan.example.CoffeeTracker.controllers;

import com.codeclan.example.CoffeeTracker.models.Coffee;
import com.codeclan.example.CoffeeTracker.repositories.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoffeeController {

    @Autowired
    CoffeeRepository coffeeRepository;

    @GetMapping(value = "/coffees/{strength}")
    public ResponseEntity getAllCoffeesOfStrength4(@PathVariable int strength){
        return new ResponseEntity<>(coffeeRepository.findCoffeeByStrength(strength), HttpStatus.OK);
    }

    //    Get all the coffee from a particular coffee
//    shop that's a specific age.

    @GetMapping(value="coffeeshop/coffees/{age}")
    public ResponseEntity getCoffeeFromCoffeeShopByAge(@PathVariable int age){
        return new ResponseEntity<>(coffeeRepository.getCoffeesByAge(age), HttpStatus.OK);
    }




}
