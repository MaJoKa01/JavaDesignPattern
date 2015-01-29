package de.bridge.shape;

import java.util.logging.Logger;

public class RedCircle implements DrawAPI {
    private static final Logger LOGGER = Logger.getLogger("RedCircle");

    public void drawCircle(int radius, int x, int y) {
        LOGGER.fine("Drawing Circle[ color: red, radius: " + radius + ", x: "
                + x + ", " + y + "]");
    }
}
