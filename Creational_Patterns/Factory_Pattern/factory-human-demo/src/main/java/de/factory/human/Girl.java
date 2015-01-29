package de.factory.human;

import java.util.logging.Logger;

class Girl implements IHuman {

    private static final Logger LOGGER = Logger.getLogger("SpeciesApp");

    public void talk() {
        LOGGER.fine("Girl is talking...");
    }

    public void walk() {
        LOGGER.fine("Girl is walking...");
    }
}
