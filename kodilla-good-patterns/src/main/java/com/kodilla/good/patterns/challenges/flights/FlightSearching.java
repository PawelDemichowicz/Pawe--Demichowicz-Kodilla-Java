package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearching {

    private static final String ARRIVAL = "Arrival";
    private static final String DEPARTURE = "Departure";
    private static final String CHANGE = "Change";
    private FlightsData flightsData;
    
    public FlightSearching(final FlightsData flightsData) {
        this.flightsData = flightsData;
    }

    public void searchingResult(String destination, String airPort) {

        if (ARRIVAL.equals(destination)) {
            System.out.println(searchingByArrival(airPort));
        } else if (DEPARTURE.equals(destination)) {
            System.out.println(searchingByDeparture(airPort));
        } else if (CHANGE.equals(destination)) {
            System.out.println(searchingByChange(airPort));
        }
    }


    private List<Flights> searchingByArrival(String arrival) {
        return flightsData.getFlights().stream()
                .filter(f -> f.getTo().equals(arrival))
                .collect(Collectors.toList());
    }

    private List<Flights> searchingByDeparture(String departure) {
        return flightsData.getFlights().stream()
                .filter(f -> f.getFrom().equals(departure))
                .collect(Collectors.toList());
    }

    private List<Flights> searchingByChange(String change) {
        return flightsData.getFlights().stream()
                .filter(f -> f.getThrough().equals(change))
                .collect(Collectors.toList());
    }
}
