package de.adapter.shape;

import java.util.logging.Logger;

public class LegacyLine {

    private static final Logger LOGGER = Logger.getLogger("LegacyLine");

    public void draw(int x1, int y1, int x2, int y2) {
        LOGGER.fine("line from (" + x1 + ',' + y1 + ") to (" + x2 + ',' + y2
                + ')');
    }
}
