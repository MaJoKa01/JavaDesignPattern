package de.proxy.folder;

import java.util.logging.Logger;

public class Folder implements IFolder {
    private static final Logger LOGGER = Logger.getLogger("Folder");


    public void performOperations() {
        // access folder and perform various operations like copy or cut files
        LOGGER.fine("Performing operation on folder");
    }

}
