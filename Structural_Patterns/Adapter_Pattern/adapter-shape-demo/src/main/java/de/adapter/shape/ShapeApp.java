package de.adapter.shape;

public class ShapeApp {
   
    
    private static final int X1=10;
    private static final int X2=30;
    private static final int Y1=20;
    private static final int Y2=60;
    private ShapeApp(){
        
    }
    
    public static void main(String[] args) {
        Shape[] shapes = { new Line(), new Rectangle() };
        // A begin and end point from a graphical editor
        for (int i = 0; i < shapes.length; ++i) {
            shapes[i].draw(X1, Y1, X2, Y2);
        }

    }
}
