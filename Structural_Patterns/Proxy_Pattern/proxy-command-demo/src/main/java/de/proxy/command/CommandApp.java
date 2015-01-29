package de.proxy.command;

import java.util.logging.Logger;

public class CommandApp {

    private static final Logger LOGGER = Logger.getLogger("CommandApp");

    private CommandApp() {

    }

    public static void main(String[] args) {
        ICommandExecutor executor = new CommandExecutorProxy("Martin", "Test");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            LOGGER.fine("Exception Message::" + e.getMessage());
        }

    }
}
