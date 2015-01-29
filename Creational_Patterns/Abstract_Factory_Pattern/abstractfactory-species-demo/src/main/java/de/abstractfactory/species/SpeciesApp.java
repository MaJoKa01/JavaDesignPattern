package de.abstractfactory.species;

import java.util.logging.Logger;

public class SpeciesApp {
    private static final Logger LOGGER = Logger.getLogger("SpeciesApp");

    private SpeciesApp(){
        
    }
    
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactory();

        SpeciesFactory speciesFactory1 = abstractFactory
                .getSpeciesFactory("reptile");
        Animal a1 = speciesFactory1.getAnimal("tyrannosaurus");
        LOGGER.fine("a1 sound: " + a1.makeSound());
        Animal a2 = speciesFactory1.getAnimal("snake");
        LOGGER.fine("a2 sound: " + a2.makeSound());

        SpeciesFactory speciesFactory2 = abstractFactory
                .getSpeciesFactory("mammal");
        Animal a3 = speciesFactory2.getAnimal("dog");
        LOGGER.fine("a3 sound: " + a3.makeSound());
        Animal a4 = speciesFactory2.getAnimal("cat");
        LOGGER.fine("a4 sound: " + a4.makeSound());
    }
}
