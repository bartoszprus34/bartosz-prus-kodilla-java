package com.kodilla.exception.test;

import java.util.Map;
import java.util.HashMap;

public class FlightScanner
{
    private final Map<String, Boolean> flightMap;

    public FlightScanner(Map<String, Boolean> flightMap) {
        this.flightMap = flightMap;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException
    {
        if (!flightMap.containsKey(flight.getDepartureAirport()) || !flightMap.containsKey(flight.getArrivalAirport()))
        {
            throw new RouteNotFoundException("Nie znaleziono lotu!");
        }
        else if (!flightMap.get(flight.getArrivalAirport()) || !flightMap.get(flight.getDepartureAirport()))
        {
            throw new RouteNotFoundException("Lot na wybrane lotnisko jest niemożliwy");
        }
        else
        {
            System.out.println("Znaleziono Twój lot:");
        }
    }
}