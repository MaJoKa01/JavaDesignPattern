package de.visitor.computer;

import java.util.logging.Logger;

public class VisitorApp {
    private static final Logger LOGGER = Logger.getLogger("VisitorApp");

    private VisitorApp(){
        
    }
    
    public static void main(String[] args) {
        LOGGER.fine("Starting VisitorApp!");
        IComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

    }
}
