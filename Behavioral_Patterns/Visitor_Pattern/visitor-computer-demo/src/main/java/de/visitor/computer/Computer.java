package de.visitor.computer;

public class Computer implements IComputerPart {

    IComputerPart[] parts;

    public Computer() {
        parts = new IComputerPart[] { new Mouse(), new Keyboard(),
                new Monitor() };
    }

    public void accept(IComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
