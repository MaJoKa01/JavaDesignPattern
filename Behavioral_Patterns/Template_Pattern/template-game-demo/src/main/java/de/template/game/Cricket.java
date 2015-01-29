package de.template.game;

import java.util.logging.Logger;

public class Cricket extends Game {
    private static final Logger LOGGER = Logger.getLogger("Cricket");

    void endPlay() {
        LOGGER.fine("Cricket Game Finished!");
    }

    void initialize() {
        LOGGER.fine("Cricket Game Initialized! Start playing.");
    }

    void startPlay() {
        LOGGER.fine("Cricket Game Started. Enjoy the game!");
    }
}
