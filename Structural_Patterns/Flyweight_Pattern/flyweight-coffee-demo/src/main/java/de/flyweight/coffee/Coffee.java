package de.flyweight.coffee;

import java.util.logging.Logger;

public class Coffee implements ICoffee {

    private final String flavor;
    private static final Logger LOGGER = Logger
            .getLogger("Coffee");

    public Coffee(String newFlavor) {
        this.flavor = newFlavor;
        LOGGER.fine("Coffee is created! - " + flavor);
    }

    public String getFlavor() {
        return this.flavor;
    }

    public void serveCoffee(CoffeeContext context) {
        LOGGER.fine("Serving " + flavor + " to table " + context.getTable());
    }
}
