package de.facade.travel;

import java.util.*;

public class HotelBooker {

    private final List<Hotel> hotelList = new ArrayList<Hotel>();

    public HotelBooker() {
        Hotel hotel = new Hotel("Ritz");
        hotelList.add(hotel);
    }

    public List<Hotel> getHotelsFor(Date from, Date to) {
        if (from.before(to)) {
            return hotelList;
        } else {
            return new ArrayList<Hotel>();
        }

    }

}
