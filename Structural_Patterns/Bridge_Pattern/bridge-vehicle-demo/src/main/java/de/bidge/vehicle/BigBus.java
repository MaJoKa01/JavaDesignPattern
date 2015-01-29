package de.bidge.vehicle;

import java.util.logging.Logger;

public class BigBus extends Vehicle {
    private static final Logger LOGGER = Logger.getLogger("BigBus");
    private static final int WEIGHT = 3000;
    public BigBus(IEngine engine) {
        this.weightInKilos = WEIGHT;
        this.engine = engine;
    }

    public void drive() {
        LOGGER.fine("\nThe big bus is driving");
        int horsepower = engine.go();
        reportOnSpeed(horsepower);
    }
}
