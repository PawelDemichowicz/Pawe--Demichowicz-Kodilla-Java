package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsData {

    private final List<Flights> flights;

    public FlightsData() {
        this.flights = new ArrayList<>();
        flights.add(new Flights("Wroclaw", "Berlin", "London"));
        flights.add(new Flights("Wroclaw", "Moscow", "Singapure"));
        flights.add(new Flights("Wroclaw", "Frankfurt", "Reykjavik"));
        flights.add(new Flights("Warsaw", "Prague", "Vienna"));
        flights.add(new Flights("Warsaw", "Cracow", "Zagreb"));
    }

    public List<Flights> getFlights() {
        return flights;
    }

}
