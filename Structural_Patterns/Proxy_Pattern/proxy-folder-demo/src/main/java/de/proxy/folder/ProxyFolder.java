package de.proxy.folder;

import java.util.logging.Logger;

public class ProxyFolder implements IFolder {
    private Folder folder;
    private User user;
    private static final Logger LOGGER = Logger.getLogger("ProxyFolder");

    public ProxyFolder(User user) {
        this.user = user;
    }

    public void performOperations() {

        if ("arpit".equalsIgnoreCase(user.getUserName())
                && "arpit".equalsIgnoreCase(user.getPassword())) {
            folder = new Folder();
            folder.performOperations();
        } else {
            LOGGER.fine("You don't have access to this folder");
        }
    }

}
