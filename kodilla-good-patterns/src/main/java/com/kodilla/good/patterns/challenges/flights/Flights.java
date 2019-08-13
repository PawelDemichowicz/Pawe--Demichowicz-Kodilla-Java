package com.kodilla.good.patterns.challenges.flights;

import java.util.Objects;

public class Flights {

    private String from;
    private String to;
    private String through;

    public Flights(String from, String through, String to) {
        this.from = from;
        this.to = to;
        this.through = through;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getThrough() {
        return through;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", through='" + through + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flights flights = (Flights) o;
        return Objects.equals(from, flights.from) &&
                Objects.equals(to, flights.to) &&
                Objects.equals(through, flights.through);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, through);
    }
}
