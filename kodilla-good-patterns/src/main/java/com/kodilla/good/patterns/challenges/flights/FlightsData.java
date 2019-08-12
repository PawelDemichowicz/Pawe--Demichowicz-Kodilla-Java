package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsData {

    private List<Flights> flightsList = new ArrayList<>();

    public List<Flights> getFlights() {

        flightsList.add(new Flights("Wroclaw", "Berlin", "London"));
        flightsList.add(new Flights("Wroclaw", "Moscow", "Singapure"));
        flightsList.add(new Flights("Wroclaw", "Frankfurt", "Reykjavik"));
        flightsList.add(new Flights("Warsaw", "Prague", "Vienna"));
        flightsList.add(new Flights("Warsaw", "Cracow", "Zagreb"));

        return flightsList;
    }

    public List<Flights> getFlightsList() {
        return flightsList;
    }
}
