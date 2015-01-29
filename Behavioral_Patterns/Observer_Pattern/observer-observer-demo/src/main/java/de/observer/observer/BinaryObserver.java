package de.observer.observer;

import java.util.logging.Logger;

public class BinaryObserver extends Observer {
    private static final Logger LOGGER = Logger.getLogger("BinaryObserver");

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {
        LOGGER.fine("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }
}