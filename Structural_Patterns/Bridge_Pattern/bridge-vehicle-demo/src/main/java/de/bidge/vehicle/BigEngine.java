package de.bidge.vehicle;

import java.util.logging.Logger;

public class BigEngine implements IEngine {
    private static final int HORSEPOWER =350;
    private static final Logger LOGGER = Logger.getLogger("BigEngine");
 
    public int go() {
        LOGGER.fine("The big engine is running");
        return HORSEPOWER;
    }
}
