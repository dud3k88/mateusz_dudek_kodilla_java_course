package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {

    private Map<String, Boolean> flightPlan = new HashMap<>();

    public Map<String, Boolean> addFlight (Flight flight){
        flightPlan.put(flight.getArrivalAirport(), true);
        flightPlan.put(flight.getDepartureAirport(), true);

        return flightPlan;
    }

    public void searchingAirport (String serchingAirport) throws RouteNotFoundException{
        if (!flightPlan.containsKey(serchingAirport)){
            throw new RouteNotFoundException(serchingAirport);
        }
    }
}
