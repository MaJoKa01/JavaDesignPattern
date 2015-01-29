package de.template.game;

import java.util.logging.Logger;

public class Football extends Game {

    private static final Logger LOGGER = Logger.getLogger("Football");

    void endPlay() {
        LOGGER.fine("Football Game Finished!");
    }

    void initialize() {
        LOGGER.fine("Football Game Initialized! Start playing.");
    }

    void startPlay() {
        LOGGER.fine("Football Game Started. Enjoy the game!");
    }
}
