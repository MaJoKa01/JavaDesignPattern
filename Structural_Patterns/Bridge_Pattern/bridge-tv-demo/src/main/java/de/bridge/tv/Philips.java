package de.bridge.tv;

import java.util.logging.Logger;

public class Philips implements TV {

    private static final Logger LOGGER = Logger.getLogger("Philips");

    public void on() {
        // Philips specific on
        LOGGER.fine("Philips TV turned on");
    }

    public void off() {
        LOGGER.fine("Philips TV turned off");
        // Philips specific off
    }

    public void tuneChannel(int channel) {
        LOGGER.fine("Switch Philips TV to channel " + channel);
        // Philips specific tuneChannel
    }
}
