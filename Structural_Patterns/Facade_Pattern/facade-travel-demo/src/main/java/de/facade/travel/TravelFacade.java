package de.facade.travel;

import java.util.*;

public class TravelFacade {

    private HotelBooker hotelBooker;
    private FlightBooker flightBooker;

    public List<String> getFlightsAndHotels(Date from, Date to) {
        List<Flight> flights = flightBooker.getFlightsFor(from, to);
        List<Hotel> hotels = hotelBooker.getHotelsFor(from, to);
        List<String> stringList = new ArrayList<String>();
        stringList.add("Possible Hotels!");
        for (int i = 0; i < hotels.size(); i++) {
            stringList.add(hotels.get(i).description);
        }
        stringList.add("Possible Flights!");

        for (int i = 0; i < flights.size(); i++) {
            stringList.add(flights.get(i).description);
        }

        return stringList;

    }
}
