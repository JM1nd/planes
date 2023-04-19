package com.andrii.planes.controller;

import com.andrii.planes.repository.CityRepository;
import com.andrii.planes.service.CityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CityController {
    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }


    @GetMapping("/cities")
    public ResponseEntity getAllCities() {
        return ResponseEntity.ok(cityService.getAllCities());
    }
}
