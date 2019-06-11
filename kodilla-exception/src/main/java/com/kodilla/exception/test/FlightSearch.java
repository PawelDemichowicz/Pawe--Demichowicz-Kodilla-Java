package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public boolean findFight(Flight flight) throws RouteNotFoundException
    {
        Map<String,Boolean> flights = new HashMap<>();

        flights.put("Frankfurt", true);
        flights.put("London", true);
        flights.put("New York", false);
        flights.put("Moscow", true);

        if(flights.containsKey(flight.getArrivalAirport())){
            if(flights.get(flight.getArrivalAirport())){
                System.out.println("You can flight to " + flight.getArrivalAirport());
            }else{
                System.out.println("You cant flight to " + flight.getArrivalAirport() + ", please check another Airport");
            }
            return flights.get(flight.getArrivalAirport());
        } else {
            throw  new RouteNotFoundException();
        }

    }
}
