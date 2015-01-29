package de.factory.human;

import java.util.logging.Logger;

class Boy implements IHuman {

    private static final Logger LOGGER = Logger.getLogger("Boy");

    public void talk() {
        LOGGER.fine("Boy is talking...");
    }

    public void walk() {
        LOGGER.fine("Boy is walking...");
    }
}