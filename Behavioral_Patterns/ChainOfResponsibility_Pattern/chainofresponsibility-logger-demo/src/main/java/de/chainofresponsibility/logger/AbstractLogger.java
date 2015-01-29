package de.chainofresponsibility.logger;

public abstract class AbstractLogger {

    protected int level;
    // next element in chain or responsibility
    protected AbstractLogger nextLogger;
  
    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);


}
