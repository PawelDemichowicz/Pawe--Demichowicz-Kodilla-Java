package com.kodilla.exception.test;

public class FlightMain {

    public static void main(String[] args) {

        Flight flight = new Flight("Wroclaw","New York");
        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFight(flight);
        } catch (RouteNotFoundException e){
            System.out.println("Airport is unavailable");
        } finally {
            System.out.println("Have a good day");
        }
    }
}
