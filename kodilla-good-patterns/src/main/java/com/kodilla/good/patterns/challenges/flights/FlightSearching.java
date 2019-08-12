package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearching {

    private FlightsData flightsData;

    public FlightSearching(final FlightsData flightsData) {
        this.flightsData = flightsData;
    }

    public List<Flights> searchingByArrival(String arrival) {
        return flightsData.getFlights().stream()
                .filter(f -> f.getTo().equals(arrival))
                .collect(Collectors.toList());
    }

    public List<Flights> searchingByDeparture(String departure) {
        return flightsData.getFlights().stream()
                .filter(f -> f.getFrom().equals(departure))
                .collect(Collectors.toList());

    }

    public List<Flights> searchingByChange(String change) {
       return flightsData.getFlights().stream()
                .filter(f -> f.getThrough().equals(change))
                .collect(Collectors.toList());
    }

    public void searchingResult(String destination, String airPort) {

        if ("Arrival".equals(destination)) {
            System.out.println(searchingByArrival(airPort));
        } else if ("Departure".equals(destination)) {
            System.out.println(searchingByDeparture(airPort));
        } else if ("Change".equals(destination)) {
            System.out.println(searchingByChange(airPort));
        }
    }
}
