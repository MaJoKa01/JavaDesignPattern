package de.observer.observer;

import java.util.logging.Logger;

public class HexaObserver extends Observer {
    private static final Logger LOGGER = Logger.getLogger("HexaObserver");

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {
        LOGGER.fine("Hex String: "
                + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
