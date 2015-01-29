package de.bridge.tv;

import java.util.logging.Logger;

public class Sony implements TV {

    private static final Logger LOGGER = Logger.getLogger("Sony");

    public void on() {
        // Sony specific on
        LOGGER.fine("Sony TV turned on");
    }

    public void off() {
        LOGGER.fine("Sony TV turned off");
        // Sony specific off
    }

    public void tuneChannel(int channel) {
        LOGGER.fine("Switch Sony TV channel to " + channel);
        // Sony specific tuneChannel
    }

}
