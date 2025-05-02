package com.electroapp.electroapp.infrastruture.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electroapp.electroapp.application.services.ICountryService;
import com.electroapp.electroapp.domain.enties.Country;

@RestController
@RequestMapping("/api/country")
public class CountryController {
    @Autowired
    private ICountryService countryService;
    
    @GetMapping
    public List<Country> list(){
        return countryService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> view(@PathVariable Long id ){
        

    }
}
