package com.andrii.planes.service;

import com.andrii.planes.model.Flight;
import com.andrii.planes.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {
    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Optional<Flight> getFlightById(int id) {
        return flightRepository.findById(id);
    }

    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    public void deleteFlightById(int id) {
        flightRepository.deleteById(id);
    }
}

