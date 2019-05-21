package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {

    private final String continentName;
    private final Set<Country> countries = new HashSet<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getCountries() {
        return countries;
    }

    public void addCountry(Country country)
    {
        countries.add(country);
    }

    public void removeCountry(Country country)
    {
        countries.remove(country);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        return continentName != null ? continentName.equals(continent.continentName) : continent.continentName == null;

    }

    @Override
    public int hashCode() {
        return continentName != null ? continentName.hashCode() : 0;
    }
}
