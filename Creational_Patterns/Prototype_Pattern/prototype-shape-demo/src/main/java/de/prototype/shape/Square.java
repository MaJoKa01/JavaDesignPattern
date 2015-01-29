package de.prototype.shape;

import java.util.logging.Logger;

public class Square extends Shape {
    private static final Logger LOGGER = Logger.getLogger("ShapeApp");

    public Square() {
        type = "Square";
    }

    public void draw() {
        LOGGER.fine("Inside Square::draw() method.");
    }
}