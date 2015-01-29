package de.bidge.vehicle;

import java.util.logging.Logger;

public class SmallCar extends Vehicle {
    
    private static final Logger LOGGER = Logger.getLogger("SmallCar");
    private static final int WEIGHT= 600;
    public SmallCar(IEngine engine) {
        this.weightInKilos = WEIGHT;
        this.engine = engine;
    }

    @Override
    public void drive() {
        LOGGER.fine("\nThe small car is driving");
        int horsepower = engine.go();
        reportOnSpeed(horsepower);
    }
}
