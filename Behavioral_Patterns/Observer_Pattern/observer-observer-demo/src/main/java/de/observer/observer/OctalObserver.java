package de.observer.observer;

import java.util.logging.Logger;

public class OctalObserver extends Observer {
    private static final Logger LOGGER = Logger.getLogger("OctalObserver");

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {
        LOGGER.fine("Octal String: "
                + Integer.toOctalString(subject.getState()));
    }
}
