package de.facade.travel;

import java.util.*;
import java.util.logging.Logger;

public class TravelApp {
    private static final Logger LOGGER = Logger.getLogger("TravelApp");

    private TravelApp() {

    }

    public static void main(String[] args) {
        LOGGER.fine("Travel App started!");
        TravelFacade facade = new TravelFacade();
        List<String> travelList = facade.getFlightsAndHotels(new Date(),
                new Date());
        for (int i = 0; i < travelList.size(); i++) {
            LOGGER.fine(travelList.get(i));
        }
    }
}
