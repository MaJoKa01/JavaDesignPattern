package de.adapter.shape;

import java.util.logging.Logger;

public class LegacyRectangle {

    private static final Logger LOGGER = Logger.getLogger("LegacyRectangle");

    public void draw(int x, int y, int w, int h) {
        LOGGER.fine("rectangle at (" + x + ',' + y + ") with width " + w
                + " and height " + h);
    }
}
