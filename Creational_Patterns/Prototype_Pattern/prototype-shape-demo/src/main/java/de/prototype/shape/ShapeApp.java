package de.prototype.shape;

import java.util.logging.Logger;

public class ShapeApp {
    private static final Logger LOGGER = Logger.getLogger("ShapeApp");
    private static final String SHAPE = "Shape";

    private ShapeApp() {

    }

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        LOGGER.fine(SHAPE + " : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        LOGGER.fine(SHAPE + " : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        LOGGER.fine(SHAPE + " : " + clonedShape3.getType());

    }
}
