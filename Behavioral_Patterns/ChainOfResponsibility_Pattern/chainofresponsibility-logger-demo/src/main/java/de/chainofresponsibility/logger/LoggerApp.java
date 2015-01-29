package de.chainofresponsibility.logger;

import java.util.logging.Logger;

public class LoggerApp {
    private static final Logger LOGGER = Logger.getLogger("LoggerApp");
    private static final int LOGINFO = 1;
    private static final int LOGDEBUG = 2;
    private static final int LOGERROR = 3;

    private LoggerApp() {

    }

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(LOGERROR);
        AbstractLogger fileLogger = new FileLogger(LOGDEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(LOGINFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        LOGGER.fine("Starting LoggerApp!");
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(LOGINFO, "This is an information.");

        loggerChain.logMessage(LOGDEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(LOGERROR,
                "This is an error information.");
    }

}
