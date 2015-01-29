package de.chainofresponsibility.logger;

import java.util.logging.Logger;

public class ConsoleLogger extends AbstractLogger {

    private static final Logger LOGGER = Logger.getLogger("ConsoleLogger");

    public ConsoleLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        LOGGER.fine("Standard Console::Logger: " + message);
    }
}
