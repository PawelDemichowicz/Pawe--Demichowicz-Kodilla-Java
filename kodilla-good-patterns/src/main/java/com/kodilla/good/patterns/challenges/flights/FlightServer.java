package com.kodilla.good.patterns.challenges.flights;

import java.util.Scanner;

public class FlightServer {

    public static void main(String[] args) {
        FlightsData flightsData = new FlightsData();
        FlightSearching flightSearching = new FlightSearching(flightsData);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give how you want looking for flights(Arrival,Departure,Change)");
        String destination = scanner.nextLine();

        System.out.println("Please give Airport");
        String airPort = scanner.nextLine();
        flightSearching.searchingResult(destination,airPort);

    }
}
