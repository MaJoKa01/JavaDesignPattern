package de.proxy.command;

public class CommandExecutorProxy implements ICommandExecutor {
    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd) {
        if ("Martin".equals(user) && "Test".equals(pwd)) {
            isAdmin = true;
        }
        executor = new CommandExecutor();
    }

    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            executor.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new Exception(
                        "rm command is not allowed for non-admin users.");
            } else {
                executor.runCommand(cmd);
            }
        }
    }

}
