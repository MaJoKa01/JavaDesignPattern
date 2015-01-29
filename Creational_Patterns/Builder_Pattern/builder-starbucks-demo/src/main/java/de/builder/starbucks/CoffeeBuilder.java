package de.builder.starbucks;

import java.util.logging.Logger;

class CoffeeBuilder extends StarbucksBuilder {
    private static final Logger LOGGER = Logger.getLogger("CoffeeBuilder");

    public void buildSize() {
        starbucks.setSize("medium");
        LOGGER.fine("build medium size");
    }

    public void buildDrink() {
        starbucks.setDrink("coffee");
        LOGGER.fine("build coffee");
    }
}
