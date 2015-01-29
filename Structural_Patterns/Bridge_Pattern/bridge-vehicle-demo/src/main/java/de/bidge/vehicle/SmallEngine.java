package de.bidge.vehicle;

import java.util.logging.Logger;

public class SmallEngine implements IEngine {

    private static final Logger LOGGER = Logger.getLogger("SmallEngine");
    private static final int HORSEPOWER= 100;
   
    
    public int go() {
        LOGGER.fine("The small engine is running");
        return HORSEPOWER;
    }
}
