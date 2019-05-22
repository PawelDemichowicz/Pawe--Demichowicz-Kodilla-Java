package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class  World {

    private final Set<Continent> continents = new HashSet<>();

    public void addContinent(Continent continent)
    {
        continents.add(continent);
    }

    public void removeContinent(Continent continent)
    {
        continents.remove(continent);
    }

    public BigDecimal getPeopleQuantity()
    {
        BigDecimal peopleQuantityOfWorld;
        return peopleQuantityOfWorld = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum,current) -> sum = sum.add(current));
    }
}
