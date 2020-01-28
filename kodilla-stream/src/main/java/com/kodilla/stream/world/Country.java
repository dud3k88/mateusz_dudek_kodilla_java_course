package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private final String countryName;
    private final BigDecimal peopleQuantityOfCountry;
    private final String continent;

    public Country(String countryName, BigDecimal peopleQuantityOfCountry, String continent) {
        this.countryName = countryName;
        this.peopleQuantityOfCountry = peopleQuantityOfCountry;
        this.continent = continent;
    }

    public BigDecimal getPeopleQuantity (){
        return peopleQuantityOfCountry;
    }
}
