package de.abstractfactory.computer;

import java.util.logging.Logger;

class IntelCPU implements CPU {

    private static final Logger LOGGER = Logger.getLogger("IntelCPU");

    public void process() {
        LOGGER.fine("Intel is processing...");
    }
}
