package de.abstractfactory.species;

public class ReptileFactory extends SpeciesFactory {

    public Animal getAnimal(String type) {
        if ("snake".equals(type)) {
            return new Snake();
        } else {
            return new Tyrannosaurus();
        }
    }

}