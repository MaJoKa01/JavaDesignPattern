package de.bridge.shape;

public class BridgeShapeDemo {

    private static final int X1 = 100;
    private static final int Y1 = 100;
    private static final int DIAMETER = 10;

    private BridgeShapeDemo() {

    }

    public static void main(String[] args) {
        Shape redCircle = new Circle(X1, Y1, DIAMETER, new RedCircle());
        Shape greenCircle = new Circle(X1, Y1, DIAMETER, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}
