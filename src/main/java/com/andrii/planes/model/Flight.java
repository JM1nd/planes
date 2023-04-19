package com.andrii.planes.model;

import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "flight_id")
    private Integer Id;

    @Column(name = "departure_city_id")
    private Integer departureCityId;
    @Column(name = "arrival_city_id")
    private Integer arrivalCityId;

    @Column(name = "departure_time")
    private OffsetDateTime departureTime;

    @Column(name = "arrival_time")
    private OffsetDateTime arrivalTime;

    @Column(name = "flight_number")
    private Integer flightNumber;

    @Column(name = "price")
    private Double price;

    @Column(name = "created_at")
    private OffsetDateTime createdAt;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getDepartureCityId() {
        return departureCityId;
    }

    public void setDepartureCityId(Integer departureCityId) {
        this.departureCityId = departureCityId;
    }

    public Integer getArrivalCityId() {
        return arrivalCityId;
    }

    public void setArrivalCityId(Integer arrivalCityId) {
        this.arrivalCityId = arrivalCityId;
    }

    public OffsetDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(OffsetDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public OffsetDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(OffsetDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
