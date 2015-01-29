package de.bridge.shape;

import java.util.logging.Logger;

public class GreenCircle implements DrawAPI {

    private static final Logger LOGGER = Logger.getLogger("GreenCircle");

    public void drawCircle(int radius, int x, int y) {
        LOGGER.fine("Drawing Circle[ color: green, radius: " + radius + ", x: "
                + x + ", " + y + "]");
    }
}
