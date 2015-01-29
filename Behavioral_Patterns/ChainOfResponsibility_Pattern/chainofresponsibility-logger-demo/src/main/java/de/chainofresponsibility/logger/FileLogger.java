package de.chainofresponsibility.logger;

import java.util.logging.Logger;

public class FileLogger extends AbstractLogger {
    private static final Logger LOGGER = Logger.getLogger("FileLogger");

    public FileLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        LOGGER.fine("File::Logger: " + message);
    }
}
