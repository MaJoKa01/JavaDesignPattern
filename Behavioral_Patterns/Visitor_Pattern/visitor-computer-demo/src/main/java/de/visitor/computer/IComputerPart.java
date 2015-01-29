package de.visitor.computer;

public interface IComputerPart {
    public void accept(IComputerPartVisitor computerPartVisitor);
}
