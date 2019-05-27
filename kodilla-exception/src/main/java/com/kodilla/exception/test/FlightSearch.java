package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFight(Flight flight) throws RouteNotFoundException
    {
        Map<String,Boolean> flights = new HashMap<>();

        flights.put("Frankfurt", true);
        flights.put("London", true);
        flights.put("New York", false);
        flights.put("Moscow", true);

        for(Map.Entry<String,Boolean> entry : flights.entrySet()) {

            if(entry.getKey().equals(flight.getArrivalAirport())) {
                if (entry.getValue()) {
                    System.out.println("You can flight to: " + entry.getKey());
                } else{
                    System.out.println("You cant flight to: " + entry.getKey());
                }
            } else {
                throw new RouteNotFoundException("Airport is unavailable");
            }
        }
    }
}
