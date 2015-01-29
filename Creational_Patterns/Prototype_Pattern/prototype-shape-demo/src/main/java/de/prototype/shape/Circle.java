package de.prototype.shape;

import java.util.logging.Logger;

public class Circle extends Shape {

    private static final Logger LOGGER = Logger.getLogger("Circle");

    public Circle() {
        type = "Circle";
    }

    public void draw() {
        LOGGER.fine("Inside Circle::draw() method.");
    }
}
