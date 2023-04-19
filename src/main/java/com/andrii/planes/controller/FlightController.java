package com.andrii.planes.controller;

import com.andrii.planes.model.Flight;
import com.andrii.planes.service.FlightService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FlightController {
    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/flights")
    public ResponseEntity getAllFlights() {
        return ResponseEntity.ok(flightService.getAllFlights());
    }

    @GetMapping("/flights/{id}")
    public ResponseEntity getFlightById(@PathVariable int id) {
        return ResponseEntity.ok(flightService.getFlightById(id));
    }

    @PostMapping(value = "/flights/add", produces = "application/json", consumes = "application/json" )
    public ResponseEntity createFlight(@RequestBody Flight flight) {
        return ResponseEntity.ok(flightService.createFlight(flight));
    }

    @DeleteMapping("/flights/{id}")
    public ResponseEntity deleteFlightById(@PathVariable int id) {
        flightService.deleteFlightById(id);
        return ResponseEntity.noContent().build();
    }
}
