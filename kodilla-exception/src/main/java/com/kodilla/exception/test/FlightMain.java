package com.kodilla.exception.test;

public class FlightMain {

    public static void main(String[] args) {

        Flight flight = new Flight("Wroclaw","London");
        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFight(flight);
        } catch (RouteNotFoundException e){
            System.out.println(e);
        }
    }
}
