package de.chainofresponsibility.logger;

import java.util.logging.Logger;

public class ErrorLogger extends AbstractLogger {
    private static final Logger LOGGER = Logger.getLogger("ErrorLogger");

    public ErrorLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        LOGGER.fine("Error Console::Logger: " + message);
    }
}
