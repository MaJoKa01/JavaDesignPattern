package de.memento.memento;

import java.util.logging.Logger;

public class MementoApp {
    private static final Logger LOGGER = Logger.getLogger("MementaApp");

    private MementoApp() {

    }

    public static void main(String[] args) {
        LOGGER.fine("Starting MementoApp!");
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        LOGGER.fine("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        LOGGER.fine("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        LOGGER.fine("Second saved State: " + originator.getState());

    }
}
