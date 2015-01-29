package de.decorator.girlfriend;

import java.util.logging.Logger;

public class GirlApp {
    private static final Logger LOGGER = Logger.getLogger("GirlApp");

    private GirlApp() {

    }

    public static void main(String[] args) {
        Girl g1 = new AmericanGirl();
        LOGGER.fine(g1.getDescription());

        Science g2 = new Science(g1);
        LOGGER.fine(g2.getDescription());

        Art g3 = new Art(g2);
        LOGGER.fine(g3.getDescription());
    }
}
