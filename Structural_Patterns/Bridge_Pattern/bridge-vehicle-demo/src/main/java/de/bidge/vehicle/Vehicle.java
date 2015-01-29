package de.bidge.vehicle;

import java.util.logging.Logger;

public abstract class Vehicle {
    protected IEngine engine;
    protected int weightInKilos;
    private static final Logger LOGGER = Logger.getLogger("VehicleApp");
    private static final int RATIO_LOWER_LIMIT =3;
    private static final int RATIO_UPPER_LIMIT =8;
    
    public abstract void drive();

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public void reportOnSpeed(int horsepower) {
        int ratio = weightInKilos / horsepower;
        if (ratio < RATIO_LOWER_LIMIT) {
            LOGGER.fine("The vehicle is going at a fast speed.");
        } else if ((ratio >= RATIO_LOWER_LIMIT) && (ratio < RATIO_UPPER_LIMIT)) {
            LOGGER.fine("The vehicle is going an average speed.");
        } else {
            LOGGER.fine("The vehicle is going at a slow speed.");
        }
    }
}
