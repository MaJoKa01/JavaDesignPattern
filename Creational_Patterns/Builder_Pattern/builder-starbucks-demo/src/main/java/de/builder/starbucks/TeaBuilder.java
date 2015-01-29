package de.builder.starbucks;

import java.util.logging.Logger;

class TeaBuilder extends StarbucksBuilder {

    private static final Logger LOGGER = Logger.getLogger("TeaBuilder");

    public void buildSize() {
        starbucks.setSize("large");
        LOGGER.fine("build large size");
    }

    public void buildDrink() {
        starbucks.setDrink("tea");
        LOGGER.fine("build tea");
    }

}
