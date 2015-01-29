package de.visitor.computer;

import java.util.logging.Logger;

public class ComputerPartDisplayVisitor implements IComputerPartVisitor {

    private static final Logger LOGGER = Logger.getLogger("ComputerPartDisplayVisitor");

    public void visit(Computer computer) {
        LOGGER.fine("Displaying Computer.");
    }

    public void visit(Mouse mouse) {
        LOGGER.fine("Displaying Mouse.");
    }

    public void visit(Keyboard keyboard) {
       LOGGER.fine("Displaying Keyboard.");
    }

    public void visit(Monitor monitor) {
        LOGGER.fine("Displaying Monitor.");
    }
}