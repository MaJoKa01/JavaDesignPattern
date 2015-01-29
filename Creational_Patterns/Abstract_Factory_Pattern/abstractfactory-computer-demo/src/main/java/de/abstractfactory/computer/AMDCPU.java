package de.abstractfactory.computer;

import java.util.logging.Logger;

class AMDCPU implements CPU {

    private static final Logger LOGGER = Logger.getLogger("AMDCPU");

    public void process() {
        LOGGER.fine("AMD is processing...");
    }
}
