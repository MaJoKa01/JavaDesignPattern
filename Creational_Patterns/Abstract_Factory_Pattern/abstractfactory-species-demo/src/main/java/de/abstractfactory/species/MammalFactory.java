package de.abstractfactory.species;

public class MammalFactory extends SpeciesFactory {

    public Animal getAnimal(String type) {
        if ("dog".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }

}
