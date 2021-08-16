package com.kodilla.exception.test;

import java.util.Map;
import java.util.HashMap;

public class FindFlightRunner {
    public static void main(String[] args) {

        Flight flight1 = new Flight("Warszawa", "Madryt");
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Warszawa", true);
        flights.put("Krakow", true);
        flights.put("Kijów", false);
        flights.put("Madryt", false);
        flights.put("Toronto", true);
        flights.put("Oslo", true);
        flights.put("Paryż", true);
        flights.put("Radom", false);

        FlightScanner flightScanner = new FlightScanner(flights);
        try {
            flightScanner.findFlight(flight1);
        } catch (RouteNotFoundException re) {
            System.out.println("Obecnie brak bezpośrednich lotów" + "\n" + re);
        } finally {
            System.out.println("Szukano lotu pomiędzy podanymi miastami");
        }
    }
}