package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Continent {

    private Country country;
    private final String continentName;
    private final List<Country> countries = new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public BigDecimal getPeopleQuantity() {
        return country.getPeopleQuantity();
    }

    public List<Country> getCountries() {
        return countries;
    }
}
