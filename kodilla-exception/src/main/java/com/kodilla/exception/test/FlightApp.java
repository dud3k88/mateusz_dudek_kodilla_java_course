package com.kodilla.exception.test;

public class FlightApp {

    public static void main(String[] args) {

        SearchFlight searchFlight = new SearchFlight();
        searchFlight.addFlight(new Flight("Warszawa", "Gdańsk"));
        searchFlight.addFlight(new Flight("Poznań", "Oslo"));
        searchFlight.addFlight(new Flight("Warszawa", "Madryt"));
        searchFlight.addFlight(new Flight("Katowice", "Barcelona"));

        try{
            searchFlight.searchingAirport("Kluczbork");
        } catch (RouteNotFoundException e){
            System.out.println("Sorry but: " + e);
        } finally {
            System.out.println("Try again");
        }

    }
}
