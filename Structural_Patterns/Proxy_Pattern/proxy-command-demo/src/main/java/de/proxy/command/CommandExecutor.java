package de.proxy.command;

import java.util.logging.Logger;

public class CommandExecutor implements ICommandExecutor {

    private static final Logger LOGGER = Logger.getLogger("CommandExecutor");

    public void runCommand(String cmd) throws Exception {
        // some heavy implementation
        Runtime.getRuntime().exec(cmd);
        LOGGER.fine("'" + cmd + "' command executed.");
    }
}
