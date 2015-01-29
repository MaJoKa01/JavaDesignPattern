package de.prototype.shape;

import java.util.logging.Logger;

public class Rectangle extends Shape {

    private static final Logger LOGGER = Logger.getLogger("Rectangle");

    public Rectangle() {
        type = "Rectangle";
    }

    public void draw() {
        LOGGER.fine("Inside Rectangle::draw() method.");
    }
}