package de.visitor.computer;

public class Keyboard implements IComputerPart {

    public void accept(IComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}