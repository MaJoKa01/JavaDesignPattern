package de.strategy.mathe;

import java.util.logging.Logger;

public class MatheApp {
    private static final Logger LOGGER = Logger.getLogger("MatheApp");
    private static final int NUMBER1 = 10;
    private static final int NUMBER2 = 5;
    private MatheApp() {

    }

    public static void main(String[] args) {
        LOGGER.fine("Starting MatheApp!");

       

        Context context = new Context(new OperationAdd());
        LOGGER.fine("10 + 5 = " + context.executeStrategy(NUMBER1, NUMBER2));

        context = new Context(new OperationSubstract());
        LOGGER.fine("10 - 5 = " + context.executeStrategy(NUMBER1, NUMBER2));

        context = new Context(new OperationMultiply());
        LOGGER.fine("10 * 5 = " + context.executeStrategy(NUMBER1, NUMBER2));

    }
}
