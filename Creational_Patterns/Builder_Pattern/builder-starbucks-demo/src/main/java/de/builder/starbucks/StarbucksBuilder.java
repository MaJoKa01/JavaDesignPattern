package de.builder.starbucks;

import java.util.logging.Logger;

abstract class StarbucksBuilder {
    protected Starbucks starbucks;
    private static final Logger LOGGER = Logger.getLogger("StarbucksBuilder");

    public Starbucks getStarbucks() {
        return starbucks;
    }

    public void createStarbucks() {
        starbucks = new Starbucks();
        LOGGER.fine("a drink is created");
    }

    public abstract void buildSize();

    public abstract void buildDrink();
}