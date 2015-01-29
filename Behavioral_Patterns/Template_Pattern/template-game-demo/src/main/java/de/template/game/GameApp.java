package de.template.game;

import java.util.logging.Logger;

public class GameApp {
    private static final Logger LOGGER = Logger.getLogger("GameApp");

    private GameApp() {

    }

    public static void main(String[] args) {
        LOGGER.fine("Starting GameApp!");
        Game game = new Cricket();
        game.play();
        game = new Football();
        game.play();
    }
}
