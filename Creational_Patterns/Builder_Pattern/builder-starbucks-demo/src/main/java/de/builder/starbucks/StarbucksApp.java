package de.builder.starbucks;

import java.util.logging.Logger;

public class StarbucksApp {
    private static final Logger LOGGER = Logger.getLogger("StarbucksApp");

    private StarbucksApp() {

    }

    public static void main(String[] args) {
        LOGGER.fine("Starting StarbucksApp!");

        Waiter waiter = new Waiter();
        StarbucksBuilder coffeeBuilder = new CoffeeBuilder();

        waiter.setStarbucksBuilder(coffeeBuilder);
        waiter.constructStarbucks();

        // get the drink built
        Starbucks drink = waiter.getstarbucksDrink();
        LOGGER.fine(drink.getDrink());

    }
}
