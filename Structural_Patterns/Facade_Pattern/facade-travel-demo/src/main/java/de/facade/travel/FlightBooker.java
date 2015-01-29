package de.facade.travel;

import java.util.*;

public class FlightBooker {

    private final List<Flight> flightList = new ArrayList<Flight>();

    public FlightBooker() {
        Flight flight = new Flight("Airbus 340");
        flightList.add(flight);
    }

    public List<Flight> getFlightsFor(Date from, Date to) {
        if (from.before(to)) {
            return flightList;
        } else {
            return new ArrayList<Flight>();
        }

    }

}
