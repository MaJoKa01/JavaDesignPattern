package de.observer.observer;

import java.util.logging.Logger;

public class ObserverApp {
    private static final Logger LOGGER = Logger.getLogger("ObserverApp");
    private static final int FIRSTNUMBER = 15;
    private static final int SECONDNUMBER = 10;

    private ObserverApp() {

    }

    public static void main(String[] args) {
        LOGGER.fine("Starting ObserverApp!");

        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        LOGGER.fine("First state change: " + FIRSTNUMBER);
        subject.setState(FIRSTNUMBER);

        LOGGER.fine("Second state change: " + SECONDNUMBER);
        subject.setState(SECONDNUMBER);
    }
}
